package org.argonlang.argc.allocator;

public class FunctionCastException extends Exception {
    public enum Reason {TYPE, RETURN, NAME, PARAM_COUNT, PARAM}

    public final Reason reason;

    public final Type paramExpectedType;
    public final Type paramGivenType;
    private final int paramIndex;

    public FunctionCastException(Reason reason) {
        assert reason != Reason.PARAM;
        this.reason = reason;
        paramIndex = -1;
        paramExpectedType = null;
        paramGivenType = null;
    }

    public FunctionCastException(int paramIndex, Type paramGivenType, Type paramExpectedType) {
        this.reason = Reason.PARAM;
        this.paramIndex = paramIndex;
        this.paramGivenType = paramGivenType;
        this.paramExpectedType = paramExpectedType;
    }

    public int nonCastableParamPlace() {
        return paramIndex;
    }
}
