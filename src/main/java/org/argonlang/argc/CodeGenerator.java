package org.argonlang.argc;


import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.argonlang.argc.allocator.*;
import org.argonlang.argc.parser.ArgonLexer;
import org.argonlang.argc.parser.ArgonParser;
import org.argonlang.argc.semantic.SemanticAnalyzer;

class CodeGenerator extends PackageBasedParserListener {
    private ParseTreeProperty<Type> types = new ParseTreeProperty<>();
    private ParseTreeProperty<ExprSide> sides = new ParseTreeProperty<>();

    private enum ExprSide {R_VALUE, L_VALUE}

    CodeGenerator(SemanticAnalyzer analyzer) {
        super(analyzer);
    }

    @Override
    public void enterBlock(ArgonParser.BlockContext ctx) {
        withContext(ctx).openScope();
    }

    @Override
    public void exitBlock(ArgonParser.BlockContext ctx) {
        withContext(ctx).closeScope();
    }

    @Override
    public void exitLocalVariableDeclaration(ArgonParser.LocalVariableDeclarationContext ctx) {
        Modifier m = new Modifier();
        for (var d : ctx.variableModifier()) {
            m.add(Modifier.Directive.fromSymbol(d.getText()));
        }
        Type t = getType(ctx.typeType());
        for (var declarator : ctx.variableDeclarators().variableDeclarator()) {
            withContext(declarator).declareLocalVariable(declarator.IDENTIFIER().getText(), t, m);
        }
    }

    @Override
    public void enterMethodDeclaration(ArgonParser.MethodDeclarationContext ctx) {
        withContext(ctx).openScope();
    }

    @Override
    public void exitMethodDeclaration(ArgonParser.MethodDeclarationContext ctx) {
        withContext(ctx).closeScope();
    }

    @Override
    public void exitFormalParameterList(ArgonParser.FormalParameterListContext ctx) {
        for (var parameter : ctx.formalParameter()) {
            Type t = getType(parameter.typeType());
            withContext(parameter).declareLocalVariable(parameter.IDENTIFIER().getText(), t, new Modifier());
        }
    }

    @Override
    public void exitMethodCall(ArgonParser.MethodCallContext ctx) {
        Type[] paramTypes = new Type[0];
        if (ctx.expressionList() != null) {
            var paramExprList = ctx.expressionList().expression();
            paramTypes = new Type[paramExprList.size()];
            for (int i = 0; i < paramTypes.length; i++) {
                paramTypes[i] = types.get(paramExprList.get(i));
            }
        }
        types.put(ctx, new FunctionType(PrimitiveType.VOID, ctx.IDENTIFIER().getText(), paramTypes));
    }

    @Override
    public void exitPrimary(ArgonParser.PrimaryContext ctx) {
        var id = ctx.IDENTIFIER();
        var parent = ctx.getParent();
        if (id != null) {
            Variable v = withContext(ctx).getLocalVariable(id.getText());
            types.put(parent, v.getType());
            return;
        }
        var literal = ctx.literal();
        if (literal != null) {
            if (literal.integerLiteral() != null) {
                types.put(parent, PrimitiveType.INTEGER);
            } else if (literal.floatLiteral() != null) {
                types.put(parent, PrimitiveType.FLOAT);
            }
        }

    }

    @Override
    public void exitExpression(ArgonParser.ExpressionContext ctx) {
        if (ctx.bop != null) {
            var left = ctx.expression(0);
            switch (ctx.bop.getType()) {
                case ArgonLexer.DOT:
                    String identifier = "";
                    if (ctx.methodCall() != null) {
                        FunctionType funcType = (FunctionType) types.get(ctx.methodCall());
                        identifier = funcType.getFullName();
                    } else if (ctx.IDENTIFIER() != null) {
                        identifier = ctx.IDENTIFIER().getText();
                    }
                    Variable v = withContext(ctx).getObjectMember(types.get(left), identifier);
                    types.put(ctx, v.getType());
                    break;
            }
        }
        //todo
        if (ctx.bop != null && ctx.bop.getType() == ArgonLexer.ASSIGN) {
            var leftSide = ctx.expression(0);
            if (leftSide.bop != null && leftSide.bop.getType() != ArgonLexer.DOT) {
                error(leftSide, SemanticAnalyzer.MessageFormat.L_VALUE_ERROR);
            }
        }
    }
}
