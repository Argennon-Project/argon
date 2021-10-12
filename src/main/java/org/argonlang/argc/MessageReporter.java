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

package org.argonlang.argc;

public interface MessageReporter {
    boolean errorOccurred();

    void changeCurrentFile(String newFile);

    void error(int line, int startColumn, int endColumn, String message);

    void warning(int line, int startColumn, int endColumn, String message);

    void generalMessage(String message);
}


