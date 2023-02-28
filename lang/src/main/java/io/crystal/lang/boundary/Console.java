package io.crystal.lang.boundary;

import java.util.List;

import io.crystal.lang.boundary.operation.PrintLineOperation;
import io.crystal.lang.meta.syntax.boundary.BoundaryObject;
import io.crystal.lang.packages.Lang;

public final class Console extends BoundaryObject {

    private static final Console INSTANCE = new Console();

    public static final Console instance() {
        return INSTANCE;
    }

    private Console() {
        super(Lang.instance().getIdentifier(), "Console", List.of(PrintLineOperation.instance()));
    }
}
