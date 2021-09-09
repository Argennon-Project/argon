package org.argonlang.argc.semantic;

import org.argonlang.argc.allocator.*;

import static org.argonlang.argc.allocator.Modifier.Directive.PUBLIC;
import static org.argonlang.argc.allocator.Modifier.Directive.STATIC;
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
            analyzer.error(MessageFormat.TYPE_ALREADY_DEFINED, className, currentPackage);
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
            analyzer.error(MessageFormat.NOT_DEFINED_IN_PKG, name, currentPackage);
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

    public boolean typeExists(String name) {
        return nameSpaceManager.getFrom(currentPackage, name) != null;
    }

    public Type getType(String name) {
        return getType(name, 0);
    }

    public void setCurrentPackage(String name) {
        currentPackage = name;
    }

    public void setCurrentClass(String className) {
        if (currentClass == null) {
            currentClass = (ClassType) getType(className);
        } else {
            currentClass = (ClassType) getType(currentClass.getSymbol() + "." + className);
        }
    }

    public void exitCurrentClass() {
        currentClass = currentClass.getContainerClass();
    }

    public void importType(String fullyQualifiedName, String alias) {
        Type t = getType(fullyQualifiedName);
        try {
            nameSpaceManager.addTo(currentPackage, t, alias);
        } catch (AlreadyExistsException e) {
            analyzer.error(MessageFormat.IMPORT_EXISTS, alias, fullyQualifiedName);
        }
    }


    public void declareMethod(String name, Type returnType, Type[] params, Modifier m) {
        var f = new FunctionType(returnType, name, params);
        if (lookUpLocalVariable(f.getMethod()) != null) {
            analyzer.error(MessageFormat.METHOD_ALREADY_DEFINED, f.getFullName(), currentClass);
            return;
        }
        currentClass.addMethod(f, m);
    }

    public void declareField(String name, Type t, Modifier m) {
        if (lookUpLocalVariable(name) != null) {
            analyzer.error(MessageFormat.FIELD_ALREADY_DEFINED, name, currentClass);
            return;
        }
        currentClass.addField(name, t, m);
    }

    public void defineInnerType(String typeName, Modifier m) {
        String fullName = currentClass.getSymbol() + "." + typeName;
        ClassType newClass = new ClassType(fullName, currentPackage, currentClass, m);
        try {
            nameSpaceManager.addTo(currentPackage, newClass);
        } catch (AlreadyExistsException e) {
            analyzer.error(MessageFormat.TYPE_ALREADY_DEFINED, fullName, currentPackage);
        }
        declareField(typeName, new StaticType(newClass), m);
    }

    public void declareLocalVariable(String name, Type t, Modifier m) {
        if (lookUpLocalVariable(name) != null) {
            analyzer.error(MessageFormat.SHADOWING_ERROR, name);
        }
        localScope.addVariable(name, t, m);
    }

    public Variable getObjectMember(Type owner, String variableName) {
        Variable result = owner.getObjectVariable(variableName);
        if (result == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_IN_OBJECT, variableName, owner);
            return new Variable(variableName, PrimitiveType.UNDEFINED,
                    0, owner, new Modifier(PUBLIC));
        }
        if (!result.isAccessibleFrom(currentClass)) {
            analyzer.error(MessageFormat.MEMBER_NOT_ACCESSIBLE, owner, variableName, currentClass);
        }
        return result;
    }

    public Variable getStaticMember(Type owner, String variableName) {
        Variable result = owner.getStaticVariable(variableName);
        if (result == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_IN_CLASS, variableName, owner);
            return new Variable(variableName, PrimitiveType.UNDEFINED,
                    0, owner, new Modifier(PUBLIC, STATIC));
        }
        if (!result.isAccessibleFrom(currentClass)) {
            analyzer.error(MessageFormat.MEMBER_NOT_ACCESSIBLE, owner, variableName, currentClass);
        }
        return result;

    }

    public Variable getLocalVariable(String name) {
        Variable v = lookUpLocalVariable(name);
        if (v == null) {
            analyzer.error(MessageFormat.NOT_DEFINED_LOCAL, name);
            return new Variable("'undefined'", PrimitiveType.UNDEFINED, 0, null, null);
        }
        return v;
    }

    public Variable lookUpLocalVariable(String name) {
        Variable v = localScope.getVariable(name);
        if (v != null) return v;

        v = currentClass.getVariable(name);
        if (v != null) return v;

        Type t = nameSpaceManager.getFrom(currentPackage, name);
        return t == null ? null : new Variable(t.getSymbol(), new StaticType(t), -1, null, null);
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "nameSpaceManager=" + nameSpaceManager +
                ", localScope=" + localScope +
                '}';
    }
}


