package org.argonlang.argc;

public interface MessageReporter {
    boolean errorOccurred();

    void changeCurrentFile(String newFile);

    void error(int line, int startColumn, int endColumn, String message);

    void warning(int line, int startColumn, int endColumn, String message);

    void generalMessage(String message);
}


