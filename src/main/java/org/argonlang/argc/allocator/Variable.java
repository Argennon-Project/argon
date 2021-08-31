package org.argonlang.argc.allocator;


import java.util.Objects;

import static org.argonlang.argc.allocator.Modifier.Directive.PRIVATE;
import static org.argonlang.argc.allocator.Modifier.Directive.PUBLIC;

public class Variable {
    final String name;
    final Type type;
    long address;
    final Modifier modifier;
    final Type owner;

    public Variable(String name, Type type, long address, Type owner, Modifier modifier) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.modifier = modifier;
        this.owner = owner;
    }

    public boolean isAccessibleFrom(Type type) {
        return modifier.is(PUBLIC)
                || (modifier.is(PRIVATE) && owner == type)
                || (!modifier.is(PRIVATE) && Objects.equals(owner.getPackage(), type.getPackage()));
    }

    public long getAddress() {
        return address;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("{%s %s %s(@%d)}", modifier, type.symbol, name, address);
    }
}
