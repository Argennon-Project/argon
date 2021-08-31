package org.argonlang.argc.allocator;

import static org.argonlang.argc.allocator.Modifier.Directive.*;

public class ClassType extends Type {
    private final MemberContainer staticMembers;
    private final MemberContainer objectMembers;
    private final long staticAddress;
    private final String parentPackage;
    private final Modifier modifier;
    private final ClassType containerClass;


    public ClassType(String symbol, String parentPackage, ClassType containerClass, Modifier m) {
        super(symbol);
        staticMembers = new MemberContainer();
        objectMembers = new MemberContainer();
        modifier = m;
        this.containerClass = containerClass;
        staticAddress = 0; //todo
        this.parentPackage = parentPackage;
    }

    public ClassType(String symbol, String parentPackage, Modifier m) {
        this(symbol, parentPackage, null, m);
    }

    public String getPackage() {
        return parentPackage;
    }

    public boolean isAccessibleFrom(String packageName) {
        return modifier.is(PUBLIC) || (parentPackage.equals(packageName) && !modifier.is(PRIVATE));
    }

    private void checkIfExists(String name) throws AlreadyExistsException {
        if (getVariable(name) != null) {
            throw new AlreadyExistsException(name + " is already defined in type " + symbol);
        }
    }

    public void addField(String name, Type t, Modifier m) throws AlreadyExistsException {
        checkIfExists(name);
        Variable v = new Variable(name, t, 0, this, m);
        if (v.modifier.is(STATIC)) {
            staticMembers.addField(v);
        } else {
            objectMembers.addField(v);
        }

    }

    public void addMethod(FunctionType type, Modifier m) throws AlreadyExistsException {
        checkIfExists(type.getFullName());
        Variable v = new Variable(
                type.getFullName(),
                type,
                FunctionType.generateID(),
                this,
                m
        );
        if (v.modifier.is(STATIC)) {
            staticMembers.addMethod(v);
        } else {
            objectMembers.addMethod(v);
        }
    }

    @Override
    public Variable getStaticVariable(String name) {
        return staticMembers.getVariable(name);
    }

    @Override
    public Variable getObjectVariable(String name) {
        return objectMembers.getVariable(name);
    }

    public Variable getVariable(String name) {
        Variable v = objectMembers.getVariable(name);
        return v != null ? v : staticMembers.getVariable(name);
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
        return staticMembers.size();
    }

    @Override
    public long objectSize() {
        return objectMembers.size();
    }

    @Override
    public String toString() {
        return "ClassType{" +
                "staticMembers=" + staticMembers +
                ", objectMembers=" + objectMembers +
                ", staticAddress=" + staticAddress +
                ", parentPackage='" + parentPackage + '\'' +
                ", modifier=" + modifier +
                ", containerClass=" + containerClass +
                ", symbol='" + symbol + '\'' +
                ", superType=" + superType +
                '}';
    }

}


