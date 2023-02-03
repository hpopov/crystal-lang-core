package io.crystal.lang.boundary;

import java.util.List;

import io.crystal.lang.boundary.feature.PrintLineFeature;
import io.crystal.lang.meta.syntax.boundary.BoundaryInterface;
import io.crystal.lang.packages.Lang;

public final class SystemOut extends BoundaryInterface {

    private static final SystemOut INSTANCE = new SystemOut();

    public static final SystemOut instance() {
        return INSTANCE;
    }

    private SystemOut() {
        super(Lang.instance().getIdentifier(), "SystemOut", List.of(PrintLineFeature.instance()));
    }
}
