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


public class ArrayType extends Type {
    private final MemberContainer methods;

    {
        methods = new MemberContainer();
        var lengthMethodType = new FunctionType(PrimitiveType.INTEGER, "length", new Type[0]);
        methods.addMethod(new Variable(
                lengthMethodType.getFullName(),
                lengthMethodType,
                -1,
                this,
                new Modifier(Modifier.Directive.PUBLIC)
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
