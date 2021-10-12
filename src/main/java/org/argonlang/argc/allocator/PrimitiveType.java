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

public class PrimitiveType extends Type {
    static final Map<String, PrimitiveType> definedTypes = new HashMap<>();

    public static final PrimitiveType BOOLEAN = new PrimitiveType("boolean", 1, false);
    public static final PrimitiveType INTEGER = new PrimitiveType("int", 8, false);
    public static final PrimitiveType FLOAT = new PrimitiveType("float", 8, false);
    public static final PrimitiveType STRING = new PrimitiveType("string", 4, true);
    public static final PrimitiveType VOID = new PrimitiveType("void", 0, false);
    public static final PrimitiveType UNDEFINED = new PrimitiveType("'undefined'", 0, false);

    private final int size;
    private final boolean isReference;

    private PrimitiveType(String symbol, int size, boolean isReference) {
        super(symbol);
        this.size = size;
        this.isReference = isReference;
        definedTypes.put(symbol, this);
    }

    @Override
    public long inlineSize() {
        return size;
    }

    @Override
    public boolean isReference() {
        return isReference;
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