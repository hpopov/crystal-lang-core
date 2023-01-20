package io.startledfrog.lang.meta.syntax.common.behavior.value;

import io.startledfrog.lang.meta.syntax.common.structure.Type;

/**
 * Named after <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/4f946676a26a0383138c4e131ef5a87593dad9dc/org.modeldriven.fuml/src/main/java/fuml/semantics/values/Value.java#L18">
 * FUML Value </a>
 */
public abstract class Value {

    public abstract Type getType();
}
