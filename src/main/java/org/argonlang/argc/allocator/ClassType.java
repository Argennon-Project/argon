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

    public ClassType getContainerClass() {
        return containerClass;
    }

    public boolean isAccessibleFrom(String packageName) {
        return modifier.is(PUBLIC) || (parentPackage.equals(packageName) && !modifier.is(PRIVATE));
    }

    public void addField(String name, Type t, Modifier m) {
        Variable v = new Variable(name, t, 0, this, m);
        if (v.modifier.is(STATIC)) {
            staticMembers.addField(v);
        } else {
            objectMembers.addField(v);
        }

    }

    public void addMethod(FunctionType type, Modifier m) {
        Variable v = new Variable(
                type.getMethod(),
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
}


