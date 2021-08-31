package org.argonlang.argc.semantic;

import org.argonlang.argc.allocator.*;

import static org.argonlang.argc.semantic.SemanticAnalyzer.MessageFormat;

public class SymbolTable {
    private ClassType currentClass;
    private String currentPackage;
    private final NameSpaceManager nameSpaceManager = new NameSpaceManager();
    private final ScopeManager localScope = new ScopeManager();
    private final SemanticAnalyzer analyzer;

    public SymbolTable(SemanticAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public void defineClass(String className, Modifier m) {
        try {
            nameSpaceManager.addTo(currentPackage, new ClassType(className, currentPackage, m));
        } catch (AlreadyExistsException e) {
            analyzer.error(e.getMessage());
        }
    }

    public void openScope() {
        localScope.openScope();
    }

    public void closeScope() {
        localScope.closeScope();
    }


    /**
     * Searches the namespace for a type with the given `name` or alias. First it considers `name`
     * as a fully qualified name, if no type is found the name is considered as a name inside the current
     * package in the form: `package.name`. If still the type can not be found an error will be reported.
     *
     * @param name is either a fully qualified name or a name defined in the current package.
     * @return
     */
    public Type getType(String name, int dimension) {
        Type t = nameSpaceManager.getFrom(currentPackage, name);
        if (t == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_IN_PKG_ERROR, name, currentPackage);
            return PrimitiveType.UNDEFINED;
        }
        if (!t.isAccessibleFrom(currentPackage)) {
            analyzer.error(MessageFormat.NOT_ACCESSIBLE_ERROR, name, currentPackage);
        }
        for (int i = 0; i < dimension; i++) {
            t = new ArrayType(t);
        }
        return t;
    }

    private Type getType(String name) {
        return getType(name, 0);
    }

    public void setCurrentPackage(String name) {
        currentPackage = name;
    }

    public void setCurrentClass(String className) {
        currentClass = (ClassType) getType(className);
    }

    public void importType(String fullyQualifiedName, String alias) {
        Type t = getType(fullyQualifiedName);
        try {
            nameSpaceManager.addTo(currentPackage, t, alias);
        } catch (AlreadyExistsException e) {
            analyzer.error(MessageFormat.IMPORT_EXISTS_ERROR, e, fullyQualifiedName);
        }
    }

    public void defineInnerType(String typeName) {

    }

    public void declareMethod(String name, Type returnType, Type[] params, Modifier m) {
        try {
            currentClass.addMethod(new FunctionType(returnType, name, params), m);
        } catch (AlreadyExistsException e) {
            analyzer.error(e.getMessage());
        }
    }

    public void declareField(String name, Type t, Modifier m) {
        try {
            currentClass.addField(name, t, m);
        } catch (AlreadyExistsException e) {
            analyzer.error(e.getMessage());
        }
    }

    public void declareLocalVariable(String name, Type t, Modifier m) {
        if (lookUpLocalVariable(name) != null) {
            analyzer.error(MessageFormat.SHADOWING_ERROR, name);
        }
        localScope.addVariable(name, t, m);
    }

    public Variable getObjectMember(Type owner, String variableName) {
        return getMember(owner, variableName, true);
    }

    public Variable getClassMember(Type owner, String variableName) {
        return getMember(owner, variableName, false);
    }

    private Variable getMember(Type owner, String variableName, boolean fromObject) {
        Variable v = (fromObject) ? owner.getObjectVariable(variableName) : owner.getStaticVariable(variableName);
        if (v == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_IN_TYPE_ERROR, variableName, owner.getSymbol());
            return new Variable(variableName, PrimitiveType.UNDEFINED, 0, owner, new Modifier());
        }
        if (!v.isAccessibleFrom(currentClass)) {
            analyzer.error(MessageFormat.MEMBER_NOT_ACCESSIBLE_ERROR,
                    owner.getSymbol(), variableName, currentClass.getSymbol());
        }
        return v;
    }

    public Variable getLocalVariable(String name) {
        Variable v = lookUpLocalVariable(name);
        if (v == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_LOCAL_ERROR, name);
            return new Variable("#undefined#", PrimitiveType.UNDEFINED, 0, null, null);
        }
        return v;
    }

    private Variable lookUpLocalVariable(String name) {
        Variable v = localScope.getVariable(name);
        return v != null ? v : currentClass.getVariable(name);
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "nameSpaceManager=" + nameSpaceManager +
                ", localScope=" + localScope +
                '}';
    }
}


