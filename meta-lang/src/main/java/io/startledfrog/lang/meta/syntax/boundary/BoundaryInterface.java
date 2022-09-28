package io.startledfrog.lang.meta.syntax.boundary;

import java.util.List;

import io.startledfrog.lang.meta.syntax.common.structure.Classifier;
import io.startledfrog.lang.meta.syntax.common.structure.Package;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Collection of {@link BoundaryFeature}s, which will be translated into executible-language specific procedures/elements
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoundaryInterface extends Classifier {

    @Getter(onMethod = @__(@Override))
    @Setter(onMethod = @__(@Override))
    private Package parentPackage;

    @Getter(onMethod = @__(@Override))
    private List<BoundaryFeature> features;
    
}
