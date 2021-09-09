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
                paramTypes[i] = getType(paramExprList.get(i));
            }
        }
        types.put(ctx, new FunctionType(PrimitiveType.UNDEFINED, ctx.IDENTIFIER().getText(), paramTypes));
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
        FunctionType funcType = null;
        if (ctx.methodCall() != null) {
            funcType = (FunctionType) types.get(ctx.methodCall());
            identifier = funcType.getMethod();
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
            if (funcType != null) {
                types.put(ctx, checkMethodCallType(ctx.methodCall(), v.getType(), funcType));
            } else {
                types.put(ctx, v.getType());
            }
        }
    }

    @Override
    public void exitMethodCallExpr(ArgonParser.MethodCallExprContext ctx) {
        FunctionType called = (FunctionType) types.get(ctx.methodCall());
        Variable v = withContext(ctx).getLocalVariable(called.getMethod());
        types.put(ctx, checkMethodCallType(ctx.methodCall(), v.getType(), called));
    }

    private Type checkMethodCallType(ArgonParser.MethodCallContext ctx, Type required, FunctionType call) {
        if (required == PrimitiveType.UNDEFINED) return required;
        if (!(required instanceof FunctionType requiredFunc)) {
            error(ctx, MessageFormat.NOT_A_FUNCTION, call.getMethod());
            return PrimitiveType.UNDEFINED;
        }
        try {
            requiredFunc.checkIfCastsTo(call);
        } catch (FunctionCastException e) {
            if (e.reason == FunctionCastException.Reason.PARAM) {
                error(ctx.expressionList().expression(e.nonCastableParamPlace()), MessageFormat.PARAM_CAST_ERROR,
                        toOrdinal(e.nonCastableParamPlace() + 1),
                        call.getMethod(),
                        e.paramGivenType,
                        e.paramExpectedType
                );
            } else if (e.reason == FunctionCastException.Reason.PARAM_COUNT) {
                error(ctx, MessageFormat.PARAM_COUNT_ERROR, call.getMethod());
            } else {
                throw new IllegalStateException("invalid cast exception");
            }
        }
        return requiredFunc.getReturnType();
    }

    private static String toOrdinal(int i) {
        String[] suffixes = new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + suffixes[i % 10];
        }
    }

    @Override
    public void exitAssignExpr(ArgonParser.AssignExprContext ctx) {
        Type left = getType(ctx.expression(0));
        Type right = getType(ctx.expression(1));
        if (!right.castsTo(left)) {
            error(ctx, MessageFormat.TYPE_CAST_ERROR, right, left);
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
            error(ctx, MessageFormat.OP_NOT_APPLICABLE, ctx.bop.getText(), left, right);
            types.put(ctx, PrimitiveType.UNDEFINED);
        }
    }

    @Override
    public void exitArrayExpr(ArgonParser.ArrayExprContext ctx) {
        var array = ctx.expression(0);
        var index = ctx.expression(1);
        if (!getType(index).castsTo(PrimitiveType.INTEGER)) {
            error(index, MessageFormat.INDEX_TYPE_ERROR);
        }
        Type type = getType(array);
        if (type instanceof ArrayType) {
            types.put(ctx, ((ArrayType) type).typeOfElements());
        } else {
            error(array, MessageFormat.NOT_ARRAY_ERROR, type);
            types.put(ctx, PrimitiveType.UNDEFINED);
        }
    }
}
