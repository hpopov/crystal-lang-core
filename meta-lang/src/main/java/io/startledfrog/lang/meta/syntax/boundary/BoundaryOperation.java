package io.startledfrog.lang.meta.syntax.boundary;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.behavior.Behavior;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import io.startledfrog.lang.meta.syntax.common.structure.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Specific child of {@link Operation}, which does not require an implementation
 * ({@link Behavior})
 */
@Data
@AllArgsConstructor
public class BoundaryOperation implements Operation {

    private String name;
    private List<Parameter> ownedParameters;
}
