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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScopeManager {
    private final List<Map<String, Variable>> scopes = new ArrayList<>();
    private final ArrayList<Long> addressTable = new ArrayList<>();

    public ScopeManager openScope() {
        if (addressTable.size() == 0) {
            addressTable.add(0L);
        } else {
            addressTable.add(addressTable.get(addressTable.size() - 1));
        }
        scopes.add(new HashMap<>());
        return this;
    }

    public ScopeManager closeScope() {
        addressTable.remove(addressTable.size() - 1);
        scopes.remove(scopes.size() - 1);
        return this;
    }

    void addVariable(Variable v) {
        v.address = addressTable.get(addressTable.size() - 1);
        addressTable.set(addressTable.size() - 1, v.address + v.type.inlineSize());
        scopes.get(scopes.size() - 1).put(v.name, v);
    }

    public void addVariable(String name, Type t, Modifier m) {
        addVariable(new Variable(name, t, 0, null, m));
    }

    public Variable getVariable(String name) {
        for (var scope : scopes) {
            Variable v = scope.get(name);
            if (v != null) return v;
        }
        return null;
    }

    public long size() {
        return addressTable.get(addressTable.size() - 1);
    }

    @Override
    public String toString() {
        return "ScopeManager{" +
                "scopes=" + scopes +
                ", addressTable=" + addressTable +
                '}';
    }
}
