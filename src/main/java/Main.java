import org.argonlang.argc.Compiler;
import org.argonlang.argc.MessageReporter;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Compiler c = new Compiler(new ConsoleReporter());
        File f = new File("here");
        System.out.println(f.getAbsolutePath());
        c.compileFiles(Objects.requireNonNull(new File("files").listFiles()));
    }
}

class ConsoleReporter implements MessageReporter {
    private boolean errorFlag;
    private String currentFile;

    @Override
    public boolean errorOccurred() {
        return errorFlag;
    }

    @Override
    public void changeCurrentFile(String newFile) {
        currentFile = newFile;
    }

    @Override
    public void error(int line, int start, int end, String message) {
        errorFlag = true;
        var str = String.format("%s(line %d:%d): %s.", currentFile, line, start, message);
        System.err.println(str);
    }

    @Override
    public void warning(int line, int start, int end, String message) {
        var str = String.format("%s(line %d, column %d) Warning: %s.", currentFile, line, start, message);
        System.err.println(str);
    }

    @Override
    public void generalMessage(String message) {
        System.err.println(message);
    }
}


