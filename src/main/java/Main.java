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


