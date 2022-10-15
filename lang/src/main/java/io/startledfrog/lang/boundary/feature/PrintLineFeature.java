package io.startledfrog.lang.boundary.feature;

import java.util.List;

import io.startledfrog.lang.meta.syntax.boundary.BoundaryFeature;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import io.startledfrog.lang.type.String;

public class PrintLineFeature extends BoundaryFeature {

    private static final PrintLineFeature INSTANCE = new PrintLineFeature();

    public static final PrintLineFeature instance() {
        return INSTANCE;
    }

    private PrintLineFeature() {
        super("printLine", List.of(new LineParameter()));
    }

    private static class LineParameter extends Parameter {

        public LineParameter() {
            super("line", String.instance(), PrintLineFeature.INSTANCE);
        }
    }
}
