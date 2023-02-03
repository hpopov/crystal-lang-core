package io.crystal.lang.type;

import io.crystal.lang.meta.syntax.classifiers.simple.PrimitiveType;
import io.crystal.lang.packages.Lang;

public class String extends PrimitiveType {

    private static final String INSTANCE = new String();

    public static final String instance() {
        return INSTANCE;
    }

    private String() {
        super(Lang.instance().getIdentifier(), "String");
    }
}
