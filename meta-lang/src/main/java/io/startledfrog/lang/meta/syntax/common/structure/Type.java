package io.startledfrog.lang.meta.syntax.common.structure;

/**
 * Parent class for any possible type: primitive, class, interface, etc. Named
 * after <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/9f140d2a9f40aabde6fc7bb185c3886707e5e6d5/org.modeldriven.fuml/src/main/java/fuml/syntax/commonstructure/Type.java#L18">FUML
 * Type</a>
 */
public abstract class Type extends AbstractPackageableElement {

    public Type(PackageIdentifier parentPackageIdentifier, String name) {
        super(parentPackageIdentifier, name);
    }
}
