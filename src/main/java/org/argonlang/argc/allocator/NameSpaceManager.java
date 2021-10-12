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

public class NameSpaceManager {
    private final Map<String, Type> nameSpaces;

    public NameSpaceManager() {
        nameSpaces = new HashMap<>();
        nameSpaces.putAll(PrimitiveType.definedTypes);
    }

    public void addTo(String nameSpace, Type t) throws AlreadyExistsException {
        addTo(nameSpace, t, t.symbol);
    }

    public void addTo(String nameSpace, Type t, String alias) throws AlreadyExistsException {
        Type previous = nameSpaces.put(nameSpace + "." + alias, t);
        if (previous != null) {
            throw new AlreadyExistsException(nameSpace + "." + alias + " already exists");
        }
    }

    public Type getFrom(String nameSpace, String typeName) {
        Type t = nameSpaces.get(typeName);

        return t != null ? t : nameSpaces.get(nameSpace + "." + typeName);
    }

    @Override
    public String toString() {
        return "NameSpaceManager{" + nameSpaces + '}';
    }
}
