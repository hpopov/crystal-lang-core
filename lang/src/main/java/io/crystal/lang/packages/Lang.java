package io.crystal.lang.packages;

import java.util.List;

import io.crystal.lang.meta.syntax.common.structure.Package;
import io.crystal.lang.meta.syntax.common.structure.PackageIdentifier;

public class Lang extends Package {

    private static final Lang INSTANCE = new Lang();

    public static final Lang instance() {
        return INSTANCE;
    }

    private Lang() {
        super(PackageIdentifier.ofUri("crystal.lang"), List.of(), List.of());
    }
}
