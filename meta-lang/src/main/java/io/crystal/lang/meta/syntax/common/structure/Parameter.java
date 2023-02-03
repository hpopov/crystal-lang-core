package io.crystal.lang.meta.syntax.common.structure;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Named after <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/6b42c525911fa980cc8fa02de0abe55d01ef18c1/org.modeldriven.fuml/src/main/java/fuml/syntax/classification/Parameter.java#L17">
 * FUML Parameter </a>
 */
@Data
@AllArgsConstructor
public class Parameter {

    private String name;
    private Type type;
}
