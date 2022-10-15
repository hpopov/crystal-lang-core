package io.startledfrog.lang.boundary;

import java.util.List;

import io.startledfrog.lang.boundary.feature.PrintLineFeature;
import io.startledfrog.lang.meta.syntax.boundary.BoundaryInterface;
import io.startledfrog.lang.packages.Lang;

public final class System extends BoundaryInterface {

    private static final System INSTANCE = new System();
    
    public static final System instance() {
        return INSTANCE;
    }

    private System() {
        super(Lang.instance(), List.of(PrintLineFeature.instance()));
    }
}
