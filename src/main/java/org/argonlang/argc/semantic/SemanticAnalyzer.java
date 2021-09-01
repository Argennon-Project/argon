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

    public void error(MessageFormat m, Object... args) {
        reporter.error(line, startColumn, endColumn, String.format(m.formatStr, args));
    }

    @Override
    public String toString() {
        return "SemanticAnalyzer{" + table + '}';
    }

    public enum MessageFormat {
        NOT_ACCESSIBLE_ERROR("%s is not accessible from %s"),
        MEMBER_NOT_ACCESSIBLE("member %2$s of %1$s is not accessible from %3$s"),
        SHADOWING_ERROR("%s shadows a previous declaration. Argon does not allow shadowing"),
        IMPORT_EXISTS("%s is already defined. Use `import %s as <name>` instead"),
        FIELD_ALREADY_DEFINED("%s is already defined in type %s"),
        METHOD_ALREADY_DEFINED("method %s is already defined in type %s"),
        TYPE_ALREADY_DEFINED("type %s is already defined in %s"),
        NOT_DEFINED_IN_PKG("%s is not defined in package %s"),
        NOT_DEFINED_IN_TYPE("%s is not defined in type %s"),
        NOT_DEFINED_LOCAL("variable %s is not defined in this scope"),
        L_VALUE_ERROR("left side of an assignment should be a variable"),
        MODIFIER_ERROR("%s is incompatible with current modifiers"),
        SOME_WARNING("this is warning %1$s");

        public final String formatStr;

        MessageFormat(String formatStr) {
            this.formatStr = formatStr;
        }
    }
}
