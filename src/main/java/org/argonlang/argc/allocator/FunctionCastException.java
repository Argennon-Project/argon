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

public class FunctionCastException extends Exception {
    public enum Reason {TYPE, RETURN, NAME, PARAM_COUNT, PARAM}

    public final Reason reason;

    public final Type paramExpectedType;
    public final Type paramGivenType;
    private final int paramIndex;

    public FunctionCastException(Reason reason) {
        assert reason != Reason.PARAM;
        this.reason = reason;
        paramIndex = -1;
        paramExpectedType = null;
        paramGivenType = null;
    }

    public FunctionCastException(int paramIndex, Type paramGivenType, Type paramExpectedType) {
        this.reason = Reason.PARAM;
        this.paramIndex = paramIndex;
        this.paramGivenType = paramGivenType;
        this.paramExpectedType = paramExpectedType;
    }

    public int nonCastableParamPlace() {
        return paramIndex;
    }
}
