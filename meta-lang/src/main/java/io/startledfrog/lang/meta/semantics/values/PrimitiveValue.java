package io.startledfrog.lang.meta.semantics.values;

import io.startledfrog.lang.meta.syntax.classifiers.simple.PrimitiveType;

/**
 * Named after <a href="https://github.com/ModelDriven/fUML-Reference-Implementation/blob/4f946676a26a0383138c4e131ef5a87593dad9dc/org.modeldriven.fuml/src/main/java/fuml/semantics/simpleclassifiers/PrimitiveValue.java#L17">
 *   FUML PrimitiveValue
 * </a>
 */
public abstract class PrimitiveValue extends Value {

    public abstract PrimitiveType getType();
}
