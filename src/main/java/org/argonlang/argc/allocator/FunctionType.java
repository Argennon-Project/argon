package org.argonlang.argc.allocator;

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
        return String.format("method %s(%s)", method, getParamsTypeAssertion());
    }
}