import org.argonlang.argc.Compiler;
import org.argonlang.argc.MessageReporter;
import org.argonlang.argc.semantic.SemanticAnalyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.argonlang.argc.semantic.SemanticAnalyzer.MessageFormat.NOT_ACCESSIBLE_ERROR;
import static org.argonlang.argc.semantic.SemanticAnalyzer.MessageFormat.NOT_DEFINED_IN_PKG_ERROR;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SemanticFileBasedTest {
    private static final String TEST_FOLDER = "testcase/semantic";
    private ErrorLogger actual, expected;

    @BeforeEach
    void setUp() throws IOException {
        expected = new ErrorLogger();
        actual = new ErrorLogger();
    }

    @Test
    @DisplayName("simple importing")
    void memberAccess() throws IOException {
        String folderName = "import1";
        expected.changeCurrentFile("src2.arg");
        expected.error(7, NOT_DEFINED_IN_PKG_ERROR, "B", "pack2");

        compileAndAssert(folderName);
    }

    @Test
    @DisplayName("import access control")
    void notDefined() throws IOException {
        String folderName = "import2";
        expected.changeCurrentFile("src2.arg");
        expected.error(3, NOT_ACCESSIBLE_ERROR, "p1.A", "p2");
        expected.error(7, NOT_ACCESSIBLE_ERROR, "A", "p2");

        compileAndAssert(folderName);
    }

    private void compileAndAssert(String folderName) throws IOException {
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
