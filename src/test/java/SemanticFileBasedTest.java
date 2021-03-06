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
import org.argonlang.argc.MessageReporter;
import org.argonlang.argc.semantic.SemanticAnalyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.argonlang.argc.semantic.SemanticAnalyzer.MessageFormat.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SemanticFileBasedTest {
    private static final String TEST_FOLDER = "testcase/semantic";
    private ErrorLogger actual, expected;

    @BeforeEach
    void setUp() {
        expected = new ErrorLogger();
        actual = new ErrorLogger();
    }

    @Test
    @DisplayName("import1")
    void simpleImport() throws IOException {
        String folderName = "import1";
        expected.changeCurrentFile("src2.arg");
        expected.error(7, NOT_DEFINED_IN_PKG, "B", "pack2");

        compileAndCheck(folderName);
    }

    @Test
    @DisplayName("import2")
    void advancedImport() throws IOException {
        String folderName = "import2";
        expected.changeCurrentFile("src1.arg");
        expected.error(11, NOT_DEFINED_IN_OBJECT, "z", "Test");

        expected.changeCurrentFile("src2.arg");
        expected.error(3, NOT_ACCESSIBLE_ERROR, "p1.A", "p2");
        expected.error(5, IMPORT_EXISTS, "C", "p1.C");
        expected.error(9, NOT_ACCESSIBLE_ERROR, "A", "p2");
        expected.error(14, NOT_DEFINED_IN_OBJECT, "w", "D");
        expected.error(15, NOT_DEFINED_IN_OBJECT, "y", "B");

        compileAndCheck(folderName);
    }

    @Test
    @DisplayName("declare1")
    void typeDeclare() throws IOException {
        String folderName = "declare1";
        expected.changeCurrentFile("src1.arg");
        expected.error(3, TYPE_ALREADY_DEFINED, "B", "p");

        expected.changeCurrentFile("src2.arg");
        expected.error(6, SHADOWING_ERROR, "f");
        expected.error(6, NOT_DEFINED_IN_PKG, "F", "p");
        expected.error(11, NOT_DEFINED_IN_PKG, "D", "p");

        compileAndCheck(folderName);
    }

    @Test
    @DisplayName("declare2")
    void varDeclare() throws IOException {
        String folderName = "declare2";

        expected.changeCurrentFile("src1.arg");
        expected.error(5, SHADOWING_ERROR, "x");
        expected.error(9, SHADOWING_ERROR, "z");
        expected.error(21, SHADOWING_ERROR, "w");
        expected.error(18, SHADOWING_ERROR, "aa");
        expected.error(27, SHADOWING_ERROR, "s");
        expected.error(28, SHADOWING_ERROR, "A");
        expected.error(40, SHADOWING_ERROR, "x");
        expected.error(19, NOT_DEFINED_LOCAL, "q");
        expected.error(40, METHOD_ALREADY_DEFINED, "f(int,A)", "A");
        expected.error(42, METHOD_ALREADY_DEFINED, "g()", "A");
        expected.error(46, METHOD_ALREADY_DEFINED, "f()", "A");
        expected.error(51, FIELD_ALREADY_DEFINED, "s", "A");
        expected.error(51, FIELD_ALREADY_DEFINED, "x", "A");

        expected.changeCurrentFile("src2.arg");
        expected.error(6, FIELD_ALREADY_DEFINED, "B", "A");
        expected.error(16, NOT_DEFINED_LOCAL, "y");
        expected.error(17, NOT_DEFINED_IN_CLASS, "y", "A");
        expected.error(18, MEMBER_NOT_ACCESSIBLE, "B", "x", "A");
        expected.error(19, SHADOWING_ERROR, "sx");
        expected.error(26, NOT_DEFINED_IN_CLASS, "x", "A");
        expected.error(38, NOT_DEFINED_IN_OBJECT, "sx", "A");
        expected.error(40, NOT_DEFINED_IN_OBJECT, "staticA", "B");
        expected.error(41, TYPE_CAST_ERROR, "int", "B");
        expected.error(42, TYPE_CAST_ERROR, "int", "A.class");

        expected.changeCurrentFile("array.arg");
        expected.error(8, TYPE_CAST_ERROR, "int", "float");
        expected.error(9, INDEX_TYPE_ERROR);
        expected.error(9, TYPE_CAST_ERROR, "int", "float");
        expected.error(13, TYPE_CAST_ERROR, "float", "int");
        expected.error(14, INDEX_TYPE_ERROR, "int", "float");
        expected.error(20, TYPE_CAST_ERROR, "A", "float");

        compileAndCheck(folderName);
    }

    @Test
    @DisplayName("access")
    void access() throws IOException {
        String folderName = "access";
        expected.changeCurrentFile("src1.arg");
        expected.error(48, MEMBER_NOT_ACCESSIBLE, "A", "x", "B");
        expected.error(52, MEMBER_NOT_ACCESSIBLE, "A", "f", "B");
        expected.error(56, MEMBER_NOT_ACCESSIBLE, "A", "sx", "B");
        expected.error(60, MEMBER_NOT_ACCESSIBLE, "A", "sf", "B");

        expected.changeCurrentFile("src2.arg");
        expected.error(8, MEMBER_NOT_ACCESSIBLE, "A", "x", "C");
        expected.error(9, MEMBER_NOT_ACCESSIBLE, "A", "y", "C");
        expected.error(12, MEMBER_NOT_ACCESSIBLE, "A", "f", "C");
        expected.error(13, MEMBER_NOT_ACCESSIBLE, "A", "g", "C");
        expected.error(16, MEMBER_NOT_ACCESSIBLE, "A", "sx", "C");
        expected.error(17, MEMBER_NOT_ACCESSIBLE, "A", "sy", "C");
        expected.error(20, MEMBER_NOT_ACCESSIBLE, "A", "sf", "C");
        expected.error(21, MEMBER_NOT_ACCESSIBLE, "A", "sg", "C");

        compileAndCheck(folderName);
    }

    @Test
    @DisplayName("methods")
    void methodCall() throws IOException {
        String folderName = "methods";
        expected.changeCurrentFile("src1.arg");
        expected.error(14, PARAM_COUNT_ERROR, "f");
        expected.error(17, PARAM_CAST_ERROR, "1st", "f", "float", "int");
        expected.error(18, PARAM_CAST_ERROR, "2nd", "g", "B.class", "B");
        expected.error(20, PARAM_CAST_ERROR, "1st", "g", "int", "A");
        expected.error(21, OP_NOT_APPLICABLE, "+", "int", "float");
        expected.error(21, PARAM_COUNT_ERROR, "f");
        expected.error(22, OP_NOT_APPLICABLE, "+", "int", "float");
        expected.error(34, TYPE_CAST_ERROR, "A", "B");
        expected.error(35, PARAM_CAST_ERROR, "1st", "getA", "B", "int");
        expected.error(37, PARAM_COUNT_ERROR, "g");
        expected.error(38, NOT_DEFINED_IN_OBJECT, "f", "B");
        expected.error(40, NOT_DEFINED_LOCAL, "g");
        expected.error(41, NOT_DEFINED_IN_CLASS, "h", "A");
        expected.error(42, PARAM_COUNT_ERROR, "h");

        compileAndCheck(folderName);
    }

    private void compileAndCheck(String folderName) throws IOException {
        Compiler c = new Compiler(actual);
        c.compileFiles(Objects.requireNonNull(new File(TEST_FOLDER, folderName).listFiles()));
        assertEquals(expected.getLog(), actual.getLog());

    }
}

class ErrorLogger implements MessageReporter {
    private final StringBasedReporter reporter = new StringBasedReporter();

    public String getLog() {
        return reporter.getErrorMessages();
    }

    @Override
    public boolean errorOccurred() {
        return reporter.errorOccurred();
    }

    @Override
    public void changeCurrentFile(String newFile) {
        reporter.changeCurrentFile(newFile);
    }

    @Override
    public void error(int line, int startColumn, int endColumn, String message) {
        reporter.error(line, 0, 0, message);
    }

    public void error(int line, SemanticAnalyzer.MessageFormat msg, Object... args) {
        error(line, 0, 0, String.format(msg.formatStr, args));
    }

    @Override
    public void warning(int line, int startColumn, int endColumn, String message) {
        reporter.warning(line, 0, 0, message);
    }

    @Override
    public void generalMessage(String message) {
    }
}
