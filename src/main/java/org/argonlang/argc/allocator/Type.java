/*
 * Copyright 2021 aybehrouz <behrouz_ayati@yahoo.com>. This file is part
 * of the Argon programming language repository.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.argonlang.argc.allocator;

import java.util.HashMap;
import java.util.Map;

public abstract class Type {
    protected String symbol;
    protected Type superType;

    public Type(String symbol) {
        this.symbol = symbol;
    }

    public Type(String symbol, Type superType) {
        this.symbol = symbol;
        this.superType = superType;
    }

    public boolean isAccessibleFrom(String packageName) {
        return true;
    }

    public boolean castsTo(Type t) {
        if (this == PrimitiveType.UNDEFINED || t == PrimitiveType.UNDEFINED) return true;
        if (this == t) return true;
        return superType != null && superType.castsTo(t);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getPackage() {
        return null;
    }

    public Variable getStaticVariable(String name) {
        return null;
    }

    public Variable getObjectVariable(String name) {
        return null;
    }

    abstract public long inlineSize();

    abstract public boolean isReference();

    abstract public long classSize();

    abstract public long objectSize();

    @Override
    public String toString() {
        return symbol;
    }

    protected static class MemberContainer {
        private final ScopeManager fields = new ScopeManager().openScope();
        private final Map<String, Variable> methods = new HashMap<>();

        MemberContainer addField(Variable v) {
            fields.addVariable(v);
            return this;
        }

        MemberContainer addMethod(Variable v) {
            methods.put(v.name, v);
            return this;
        }

        long size() {
            return fields.size();
        }

        Variable getVariable(String name) {
            Variable result = methods.get(name);
            return result == null ? fields.getVariable(name) : result;
        }

        @Override
        public String toString() {
            return "{" +
                    "fields=" + fields +
                    ", methods=" + methods +
                    '}';
        }
    }
}