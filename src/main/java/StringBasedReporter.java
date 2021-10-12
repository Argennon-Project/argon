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

import org.argonlang.argc.MessageReporter;

import java.util.SortedSet;
import java.util.TreeSet;

public class StringBasedReporter implements MessageReporter {
    private String currentFile;
    private final SortedSet<String> errors = new TreeSet<>();

    @Override
    public boolean errorOccurred() {
        return errors.size() > 0;
    }

    @Override
    public void changeCurrentFile(String newFile) {
        currentFile = newFile;
    }

    @Override
    public void error(int line, int start, int end, String message) {
        errors.add(String.format("[%s%4d:%d] %s.", currentFile, line, start, message));
    }

    @Override
    public void warning(int line, int start, int end, String message) {
        errors.add(String.format("[%s%4d:%d] Warning: %s.", currentFile, line, start, message));
    }

    public String getErrorMessages() {
        StringBuilder str = new StringBuilder();
        for (String err : errors) {
            str.append(err).append(String.format("%n"));
        }
        return str.toString();
    }

    @Override
    public void generalMessage(String message) {
        System.out.println(message);
    }
}
