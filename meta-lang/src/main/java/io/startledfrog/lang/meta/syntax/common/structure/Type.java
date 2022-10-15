package io.startledfrog.lang.meta.syntax.common.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Parent class for any possible type: primitive, class, interface, etc.
 * Named after <a href="https://github.com/ModelDriven/fUML-Reference-Implementation/blob/9f140d2a9f40aabde6fc7bb185c3886707e5e6d5/org.modeldriven.fuml/src/main/java/fuml/syntax/commonstructure/Type.java#L18">FUML Type</a>
 */
@Data
@AllArgsConstructor
public abstract class Type implements Packagable {

    @Getter(onMethod = @__(@Override))
    @Setter(onMethod = @__(@Override))
    private Package parentPackage;

    private String name;
    
}
