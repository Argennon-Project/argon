package org.argonlang.argc;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.argonlang.argc.allocator.Modifier;
import org.argonlang.argc.allocator.Type;
import org.argonlang.argc.parser.ArgonLexer;
import org.argonlang.argc.parser.ArgonParser;
import org.argonlang.argc.parser.ArgonParserBaseListener;
import org.argonlang.argc.semantic.SemanticAnalyzer;
import org.argonlang.argc.semantic.SymbolTable;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compiler {
    private final MessageReporter reporter;

    public Compiler(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public boolean compileFiles(File[] files) throws IOException {
        Map<String, ParseTree> trees = new HashMap<>();
        for (var file : files) {
            reporter.generalMessage("Parsing " + file + "...");

            // create a lexer that feeds off of input CharStream
            var lexer = new ArgonLexer(CharStreams.fromPath(file.toPath()));

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            var parser = new ArgonParser(tokens);

            // begin parsing at initial rule and store the generated parse tree.
            trees.put(file.getName(), parser.compilationUnit());
        }

        var semanticAnalyzer = new SemanticAnalyzer(reporter);

        // pass 1: find all defined types
        reporter.generalMessage("Compiling...");
        for (String fileName : trees.keySet()) {
            semanticAnalyzer.setFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new TypeDefiner(semanticAnalyzer), trees.get(fileName));       // walk parse tree
        }

        // pass 2: complete class definitions and find all members
        for (String fileName : trees.keySet()) {
            semanticAnalyzer.setFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ClassAllocator(semanticAnalyzer), trees.get(fileName));    // walk parse tree
        }

        // pass 3: generate code
        reporter.generalMessage("Generating code...");
        for (String fileName : trees.keySet()) {
            semanticAnalyzer.setFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new CodeGenerator(semanticAnalyzer), trees.get(fileName));     // walk parse tree
        }
        return !reporter.errorOccurred();
    }
}


class PackageBasedParserListener extends ArgonParserBaseListener {
    protected final SemanticAnalyzer analyzer;

    protected SymbolTable withContext(ParserRuleContext ctx) {
        return analyzer.setContext(
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine(),
                ctx.stop.getCharPositionInLine()
        );
    }

    protected SymbolTable withContext(Token ctx) {
        return analyzer.setContext(
                ctx.getLine(),
                ctx.getCharPositionInLine(),
                ctx.getCharPositionInLine()
        );
    }

    protected void error(ParserRuleContext ctx, SemanticAnalyzer.MessageFormat m, Object... args) {
        withContext(ctx);
        analyzer.error(m, args);
    }

    protected Type getType(ArgonParser.TypeTypeContext typeType) {
        return withContext(typeType).getType(
                typeType.simpleType().getText(),
                typeType.LBRACK().size()
        );
    }

    protected Type getType(ArgonParser.TypeTypeOrVoidContext typeOrVoid) {
        var t = typeOrVoid.typeType();
        return t != null ? getType(t) : withContext(typeOrVoid).getType(typeOrVoid.getText(), 0);
    }

    protected Modifier readMemberModifiers(List<ArgonParser.ModifierContext> ctx) {
        Modifier result = new Modifier();
        for (var token : ctx) {
            try {
                result.add(Modifier.Directive.fromSymbol(token.getText()));
            } catch (Exception e) {
                error(token, SemanticAnalyzer.MessageFormat.MODIFIER_ERROR, token.getText());
            }
        }
        return result;
    }

    PackageBasedParserListener(SemanticAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public void enterClassDeclaration(ArgonParser.ClassDeclarationContext ctx) {
        withContext(ctx).setCurrentClass(ctx.IDENTIFIER().getText());
    }

    @Override
    public void exitClassDeclaration(ArgonParser.ClassDeclarationContext ctx) {
        withContext(ctx).exitCurrentClass();
    }

    @Override
    public void exitPackageDeclaration(ArgonParser.PackageDeclarationContext ctx) {
        if (ctx.qualifiedName() == null) return;
        withContext(ctx.qualifiedName()).setCurrentPackage(ctx.qualifiedName().getText());
    }
}

//TODO: use visitor instead of listener to prune the tree
class TypeDefiner extends PackageBasedParserListener {
    TypeDefiner(SemanticAnalyzer analyzer) {
        super(analyzer);
    }

    @Override
    public void enterTypeDeclaration(ArgonParser.TypeDeclarationContext ctx) {
        var modifier = new Modifier();
        for (var token : ctx.classOrInterfaceModifier()) {
            try {
                modifier.add(Modifier.Directive.fromSymbol(token.getText()));
            } catch (Exception e) {
                error(token, SemanticAnalyzer.MessageFormat.MODIFIER_ERROR, token.getText());
            }
        }
        withContext(ctx.classDeclaration()).defineClass(
                ctx.classDeclaration().IDENTIFIER().getText(),
                modifier
        );
    }

    @Override
    public void enterInnerClassDeclaration(ArgonParser.InnerClassDeclarationContext ctx) {
        withContext(ctx).defineInnerType(
                ctx.classDeclaration().IDENTIFIER().getText(),
                readMemberModifiers(ctx.modifier())
        );
    }
}


class ClassAllocator extends PackageBasedParserListener {
    ClassAllocator(SemanticAnalyzer analyzer) {
        super(analyzer);
    }

    @Override
    public void exitImportDeclaration(ArgonParser.ImportDeclarationContext ctx) {
        try {
            String alias;
            if (ctx.IDENTIFIER() != null) {
                alias = ctx.IDENTIFIER().getText();
            } else {
                alias = ctx.qualifiedName().IDENTIFIER(ctx.qualifiedName().IDENTIFIER().size() - 1).getText();
            }
            withContext(ctx.qualifiedName()).importType(ctx.qualifiedName().getText(), alias);
        } catch (NullPointerException ignored) {
        }
    }

    @Override
    public void exitMethodDeclarationFull(ArgonParser.MethodDeclarationFullContext ctx) {
        var declarationCtx = ctx.methodDeclaration();
        Type[] paramTypes = new Type[0];
        if (declarationCtx.formalParameters().formalParameterList() != null) {
            var params = declarationCtx.formalParameters().formalParameterList().formalParameter();
            paramTypes = new Type[params.size()];
            for (int i = 0; i < paramTypes.length; i++) {
                paramTypes[i] = getType(params.get(i).typeType());
            }
        }
        withContext(declarationCtx).declareMethod(
                declarationCtx.IDENTIFIER().getText(),
                getType(declarationCtx.typeTypeOrVoid()),
                paramTypes,
                readMemberModifiers(ctx.modifier())
        );
    }

    @Override
    public void enterInnerClassDeclaration(ArgonParser.InnerClassDeclarationContext ctx) {
        super.enterInnerClassDeclaration(ctx);
    }

    @Override
    public void exitFieldDeclarationFull(ArgonParser.FieldDeclarationFullContext ctx) {
        var declarationCtx = ctx.fieldDeclaration();
        Type t = getType(declarationCtx.typeType());
        for (var declarator : declarationCtx.variableDeclarators().variableDeclarator()) {
            withContext(declarator).declareField(
                    declarator.IDENTIFIER().getText(),
                    t,
                    readMemberModifiers(ctx.modifier()));
        }
    }
}

