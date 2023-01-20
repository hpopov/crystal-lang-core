package io.startledfrog.lang.meta.syntax.boundary;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.structure.AbstractPackageableElement;
import io.startledfrog.lang.meta.syntax.common.structure.Package;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Collection of {@link BoundaryOperation}s, which will be translated into
 * executible-language specific procedures
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoundaryInterface extends AbstractPackageableElement {

    public BoundaryInterface(Package parentPackage, String name, List<BoundaryOperation> features) {
        super(parentPackage, name);
        this.features = features;
    }

    private List<BoundaryOperation> features;
}
