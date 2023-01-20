package io.startledfrog.lang.boundary;

import java.util.List;

import io.startledfrog.lang.boundary.feature.PrintLineFeature;
import io.startledfrog.lang.meta.syntax.boundary.BoundaryInterface;
import io.startledfrog.lang.packages.Lang;

public final class SystemOut extends BoundaryInterface {

    private static final SystemOut INSTANCE = new SystemOut();

    public static final SystemOut instance() {
        return INSTANCE;
    }

    private SystemOut() {
        super(Lang.instance(), "SystemOut", List.of(PrintLineFeature.instance()));
    }
}
