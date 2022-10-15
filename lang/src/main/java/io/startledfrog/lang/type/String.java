package io.startledfrog.lang.type;

import io.startledfrog.lang.meta.syntax.classifiers.simple.PrimitiveType;
import io.startledfrog.lang.packages.Lang;

public class String extends PrimitiveType {

    private static final String INSTANCE = new String();

    public static final String instance() {
        return INSTANCE;
    }

    private String() {
        super(Lang.instance(), "String");
    }
}
