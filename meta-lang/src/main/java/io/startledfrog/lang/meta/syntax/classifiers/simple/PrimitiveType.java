package io.startledfrog.lang.meta.syntax.classifiers.simple;

import io.startledfrog.lang.meta.syntax.common.structure.PackageIdentifier;
import io.startledfrog.lang.meta.syntax.common.structure.Type;

/**
 * Named after <a href=
 * "https://github.com/ModelDriven/fUML-Reference-Implementation/blob/9f140d2a9f40aabde6fc7bb185c3886707e5e6d5/org.modeldriven.fuml/src/main/java/fuml/syntax/simpleclassifiers/PrimitiveType.java#L15">
 * FUML PrimitiveType </a>
 */
public class PrimitiveType extends Type {

    public PrimitiveType(PackageIdentifier parentPackage, String name) {
        super(parentPackage, name);
    }
}
