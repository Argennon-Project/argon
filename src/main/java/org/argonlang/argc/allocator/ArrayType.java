package org.argonlang.argc.allocator;


public class ArrayType extends Type {
    private final MemberContainer methods;

    {
        methods = new MemberContainer();
        var lengthMethodType = new FunctionType(PrimitiveType.INTEGER, "length", new Type[0]);
        var modifier = new Modifier();
        modifier.add(Modifier.Directive.PUBLIC);
        methods.addMethod(new Variable(
                lengthMethodType.getFullName(),
                lengthMethodType,
                -1,
                this,
                modifier
        ));
    }

    public ArrayType(Type elementsType) {
        super(elementsType.symbol + "[]");
        this.elementsType = elementsType;
    }

    private final Type elementsType;

    public Type typeOfElements() {
        return elementsType;
    }

    @Override
    public Variable getObjectVariable(String name) {
        return methods.getVariable(name);
    }

    @Override
    public long inlineSize() {
        return 4;
    }

    @Override
    public boolean isReference() {
        return true;
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
