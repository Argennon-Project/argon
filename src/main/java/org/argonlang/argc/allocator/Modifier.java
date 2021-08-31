package org.argonlang.argc.allocator;

import java.util.ArrayList;
import java.util.List;

public class Modifier {
    private final List<Directive> directives = new ArrayList<>();

    public boolean is(Directive d) {
        if (d == null) return false;
        for (var has : directives) {
            if (has == d) return true;
        }
        return false;
    }

    public boolean add(Directive d) {
        if (this.is(d) || this.is(d.negate()))
            return false;
        return directives.add(d);
    }

    @Override
    public String toString() {
        return "Modifier{" + directives + '}';
    }

    public enum Directive {
        STATIC, PRIVATE, PUBLIC, FINAL, ABSTRACT;

        public Directive negate() {
            if (this == PRIVATE) return PUBLIC;
            if (this == PUBLIC) return PRIVATE;
            return null;
        }

        public static Directive fromSymbol(String symbol) {
            switch (symbol) {
                case "private":
                    return PRIVATE;
                case "public":
                    return PUBLIC;
                case "static":
                    return STATIC;
                case "final":
                    return FINAL;
                default:
                    throw new IllegalStateException("Unexpected value: " + symbol);
            }
        }
    }
}