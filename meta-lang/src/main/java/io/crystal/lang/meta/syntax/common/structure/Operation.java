package io.crystal.lang.meta.syntax.common.structure;

import java.util.Collection;

import io.crystal.lang.meta.syntax.boundary.BoundaryOperation;

/**
 * An abstraction, to combine <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/5b65bb9af780327cb5f722cd6b0169c303a343a7/org.modeldriven.fuml/src/main/java/fuml/syntax/classification/BehavioralFeature.java#L17">
 * FUML BehavioralFeature </a> and {@link BoundaryOperation}
 */
public interface Operation extends Feature {

    Collection<Parameter> getOwnedParameters();
}
