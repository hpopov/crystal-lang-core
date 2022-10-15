package io.startledfrog.lang.meta.syntax.boundary;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.behavior.Behavior;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import io.startledfrog.lang.meta.syntax.common.structure.ParameterizedFeature;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Specific child of {@link ParameterizedFeature}, which does not require an implementation ({@link Behavior})
 */
@Data
@AllArgsConstructor
public class BoundaryFeature implements ParameterizedFeature {

    private String name;
    private List<Parameter> ownedParameters;
}
