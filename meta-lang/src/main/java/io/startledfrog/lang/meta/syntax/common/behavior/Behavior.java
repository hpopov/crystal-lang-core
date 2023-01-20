package io.startledfrog.lang.meta.syntax.common.behavior;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.behavior.value.NamedValue;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Named after <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/9f140d2a9f40aabde6fc7bb185c3886707e5e6d5/org.modeldriven.fuml/src/main/java/fuml/syntax/commonbehavior/Behavior.java#L15">
 * FUML Behavior </a>
 */
@Data
@AllArgsConstructor
public abstract class Behavior {

    private List<NamedValue> ownedParameterValues;
    private List<Statement> statements;
}
