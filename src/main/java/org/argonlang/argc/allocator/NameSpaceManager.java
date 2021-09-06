package org.argonlang.argc.allocator;

import java.util.HashMap;
import java.util.Map;

public class NameSpaceManager {
    private final Map<String, Type> nameSpaces;

    public NameSpaceManager() {
        nameSpaces = new HashMap<>();
        nameSpaces.putAll(PrimitiveType.definedTypes);
    }

    public void addTo(String nameSpace, Type t) throws AlreadyExistsException {
        addTo(nameSpace, t, t.symbol);
    }

    public void addTo(String nameSpace, Type t, String alias) throws AlreadyExistsException {
        Type previous = nameSpaces.put(nameSpace + "." + alias, t);
        if (previous != null) {
            throw new AlreadyExistsException(nameSpace + "." + alias + " already exists");
        }
    }

    public Type getFrom(String nameSpace, String typeName) {
        Type t = nameSpaces.get(typeName);

        return t != null ? t : nameSpaces.get(nameSpace + "." + typeName);
    }

    @Override
    public String toString() {
        return "NameSpaceManager{" + nameSpaces + '}';
    }
}
