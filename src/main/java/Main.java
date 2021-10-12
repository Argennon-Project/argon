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

import org.argonlang.argc.Compiler;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String workingFolderName = "src";
        if (args.length > 0) workingFolderName = args[0];

        var reporter = new StringBasedReporter();
        Compiler c = new Compiler(reporter);
        File workingFolder = new File(workingFolderName);
        File[] files = workingFolder.listFiles();
        if (files != null) {
            c.compileFiles(files);
        }
        System.err.println(reporter.getErrorMessages());
    }
}


