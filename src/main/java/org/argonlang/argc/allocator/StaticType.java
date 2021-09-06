package org.argonlang.argc.allocator;

public class StaticType extends Type {
    private Type type;

    public StaticType(Type type) {
        super(type.symbol + ".class");
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public long inlineSize() {
        return 0;
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
}
