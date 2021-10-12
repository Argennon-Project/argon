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
