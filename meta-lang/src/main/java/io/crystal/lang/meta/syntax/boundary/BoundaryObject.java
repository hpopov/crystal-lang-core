package io.crystal.lang.meta.syntax.boundary;

import java.util.List;

import io.crystal.lang.meta.syntax.common.structure.AbstractPackageableElement;
import io.crystal.lang.meta.syntax.common.structure.PackageIdentifier;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Collection of {@link BoundaryOperation}s, which will be translated into
 * executible-language specific procedures
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoundaryObject extends AbstractPackageableElement {

    public BoundaryObject(PackageIdentifier parentPackageIdentifier, String name, List<BoundaryOperation> features) {
        super(parentPackageIdentifier, name);
        this.features = features;
    }

    private List<BoundaryOperation> features;
}
