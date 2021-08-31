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
        errors.add(String.format("[%s%4d, column %d] Warning: %s.", currentFile, line, start, message));
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
