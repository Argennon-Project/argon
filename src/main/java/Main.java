import org.argonlang.argc.Compiler;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        var reporter = new StringBasedReporter();
        Compiler c = new Compiler(reporter);
        c.compileFiles(Objects.requireNonNull(new File("files").listFiles()));
        System.err.println(reporter.getErrorMessages());
    }
}


