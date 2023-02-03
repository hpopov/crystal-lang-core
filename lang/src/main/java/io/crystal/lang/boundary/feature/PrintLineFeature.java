package io.crystal.lang.boundary.feature;

import java.util.List;

import io.crystal.lang.meta.syntax.boundary.BoundaryOperation;
import io.crystal.lang.meta.syntax.common.structure.Parameter;
import io.crystal.lang.type.String;

public class PrintLineFeature extends BoundaryOperation {

    private static final PrintLineFeature INSTANCE = new PrintLineFeature();

    public static final PrintLineFeature instance() {
        return INSTANCE;
    }

    private PrintLineFeature() {
        super("printLine", List.of(new LineParameter()));
    }

    private static class LineParameter extends Parameter {

        public LineParameter() {
            super("line", String.instance());
        }
    }
}
