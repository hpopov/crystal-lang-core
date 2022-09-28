package io.startledfrog.lang.meta.syntax.common.structure;

import io.startledfrog.lang.meta.syntax.boundary.BoundaryFeature;

/**
 * An abstraction, to combine <a href="https://github.com/ModelDriven/fUML-Reference-Implementation/blob/5b65bb9af780327cb5f722cd6b0169c303a343a7/org.modeldriven.fuml/src/main/java/fuml/syntax/classification/BehavioralFeature.java#L17">
 *   FUML BehavioralFeature
 * </a> and {@link BoundaryFeature}
 */
public interface ParameterizedFeature extends Feature {
    Iterable<Parameter> getOwnedParameters();
}
