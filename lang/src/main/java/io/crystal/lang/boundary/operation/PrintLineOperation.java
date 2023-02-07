package io.crystal.lang.boundary.operation;

import java.util.List;

import io.crystal.lang.meta.syntax.boundary.BoundaryOperation;
import io.crystal.lang.meta.syntax.common.structure.Parameter;
import io.crystal.lang.type.String;

public class PrintLineOperation extends BoundaryOperation {

    private static final PrintLineOperation INSTANCE = new PrintLineOperation();

    public static final PrintLineOperation instance() {
        return INSTANCE;
    }

    private PrintLineOperation() {
        super("printLine", List.of(new LineParameter()));
    }

    private static class LineParameter extends Parameter {

        public LineParameter() {
            super("line", String.instance());
        }
    }
}
