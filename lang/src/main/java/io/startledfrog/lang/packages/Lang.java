package io.startledfrog.lang.packages;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.structure.Package;

public class Lang extends Package {

    private static final Lang INSTANCE = new Lang();
    
    public static final Lang instance() {
        return INSTANCE;
    }

    private Lang() {
        super("io.startledfrog.lang", List.of(), List.of());
    }
}
