package org.argonlang.argc.allocator;

import static org.argonlang.argc.allocator.FunctionCastException.Reason;

public class FunctionType extends Type {
    private static long id = 0;

    public static long generateID() {
        return ++id;
    }

    private final Type returnType;
    private final String method;
    private final Type[] params;

    public FunctionType(Type returnType, String method, Type[] params) {
        super(null);
        this.returnType = returnType;
        this.method = method;
        this.params = params;
        this.symbol = typeAssertion();
    }

    @Override
    public boolean castsTo(Type t) {
        try {
            checkIfCastsTo(t);
            return true;
        } catch (FunctionCastException e) {
            return false;
        }
    }

    public void checkIfCastsTo(Type t) throws FunctionCastException {
        if (!(t instanceof FunctionType other)) {
            throw new FunctionCastException(Reason.TYPE);
        }
        if (!returnType.castsTo(other.returnType)) {
            throw new FunctionCastException(Reason.RETURN);
        }
        if (!method.equals(other.method)) {
            throw new FunctionCastException(Reason.NAME);
        }
        if (other.params.length != params.length) {
            throw new FunctionCastException(Reason.PARAM_COUNT);
        }
        for (int i = 0; i < params.length; i++) {
            if (!other.params[i].castsTo(params[i])) {
                throw new FunctionCastException(i, other.params[i], params[i]);
            }
        }
    }

    public String typeAssertion() {
        return String.format("func<%s %s(%s)>", returnType.symbol, method, getParamsTypeAssertion());
    }

    public String getParamsTypeAssertion() {
        StringBuilder paramsStr = new StringBuilder(100);
        for (int i = 0; i < params.length; i++) {
            paramsStr.append(params[i].symbol);
            if (i < params.length - 1) paramsStr.append(",");
        }
        return paramsStr.toString();
    }

    public String getMethod() {
        return method;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Type getParam(int i) {
        return params[i];
    }

    @Override
    public long inlineSize() {
        return 4;
    }

    @Override
    public boolean isReference() {
        return false;
    }

    @Override
    public long classSize() {
        return 0;
    }

    @Override
    public long objectSize() {
        return 0;
    }

    @Override
    public String toString() {
        return typeAssertion();
    }

    public String getFullName() {
        return String.format("%s(%s)", method, getParamsTypeAssertion());
    }
}