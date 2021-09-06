package org.argonlang.argc;


import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.argonlang.argc.allocator.*;
import org.argonlang.argc.parser.ArgonParser;
import org.argonlang.argc.semantic.SemanticAnalyzer;
import org.argonlang.argc.semantic.SemanticAnalyzer.MessageFormat;

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
            try {
                m.add(Modifier.Directive.fromSymbol(d.getText()));
            } catch (Exception e) {
                error(d, MessageFormat.MODIFIER_ERROR, d.getText());
            }
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
            Variable v = withContext(ctx).lookUpLocalVariable(id.getText());
            // When v is null we save the type as null. This indicates that The parent should infer the type.
            if (v == null) types.put(parent, null);
            else types.put(parent, v.getType());
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
    public void exitDotExpr(ArgonParser.DotExprContext ctx) {
        var left = ctx.expression();
        String identifier = "";
        if (ctx.methodCall() != null) {
            FunctionType funcType = (FunctionType) types.get(ctx.methodCall());
            identifier = funcType.getFullName();
        } else if (ctx.IDENTIFIER() != null) {
            identifier = ctx.IDENTIFIER().getText();
        }
        if (types.get(left) == null) {
            Variable v = withContext(ctx).lookUpLocalVariable(ctx.getText());
            types.put(ctx, v == null ? null : v.getType());
        } else {
            Type t = types.get(left);
            Variable v;
            if (t instanceof StaticType) {
                v = withContext(ctx).getStaticMember(((StaticType) t).getType(), identifier);
            } else {
                v = withContext(ctx).getObjectMember(t, identifier);
            }
            types.put(ctx, v.getType());
        }
    }

    @Override
    public void exitAssignExpr(ArgonParser.AssignExprContext ctx) {
        Type left = getType(ctx.expression(0));
        Type right = getType(ctx.expression(1));
        if (!right.castsTo(left)) {
            error(ctx, MessageFormat.TYPE_CAST_ERROR, right.getSymbol(), left.getSymbol());
        }
        types.put(ctx, left);
    }

    private Type getType(ArgonParser.ExpressionContext expr) {
        Type result = types.get(expr);
        if (result == null) {
            error(expr, MessageFormat.NOT_DEFINED_LOCAL, expr.getText(), "");
            return PrimitiveType.UNDEFINED;
        }
        return result;
    }

    @Override
    public void exitAddExpr(ArgonParser.AddExprContext ctx) {
        Type left = getType(ctx.expression(0));
        Type right = getType(ctx.expression(1));
        if ((left.castsTo(PrimitiveType.INTEGER) && right.castsTo(PrimitiveType.INTEGER)) ||
                (left.castsTo(PrimitiveType.FLOAT) && right.castsTo(PrimitiveType.FLOAT))) {
            types.put(ctx, left);
        } else {
            error(ctx, MessageFormat.OP_NOT_APPLICABLE, ctx.bop.getText(), left.getSymbol(), right.getSymbol());
            types.put(ctx, PrimitiveType.UNDEFINED);
        }
    }
}
