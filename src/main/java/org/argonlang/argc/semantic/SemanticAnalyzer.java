package org.argonlang.argc.semantic;

import org.argonlang.argc.MessageReporter;

public class SemanticAnalyzer {
    private final MessageReporter reporter;
    private int line;
    private int startColumn;
    private int endColumn;
    private final SymbolTable table = new SymbolTable(this);

    public SemanticAnalyzer(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public SymbolTable setContext(int line, int startColumn, int endColumn) {
        this.line = line;
        this.startColumn = startColumn;
        this.endColumn = endColumn;
        return table;
    }

    public SemanticAnalyzer setFile(String fileName) {
        reporter.changeCurrentFile(fileName);
        return this;
    }

    public void error(String message) {
        reporter.error(line, startColumn, endColumn, message);
    }

    @Override
    public String toString() {
        return "SemanticAnalyzer{" + table + '}';
    }
}
