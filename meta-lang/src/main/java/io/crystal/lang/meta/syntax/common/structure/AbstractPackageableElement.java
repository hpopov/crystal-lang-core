package io.crystal.lang.meta.syntax.common.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created merely as an abstract parent to incorporate <code>name</code> and
 * {@link Packagable}
 */
@Data
@AllArgsConstructor
public abstract class AbstractPackageableElement implements Packagable {

    @Getter(onMethod = @__(@Override))
    @Setter(onMethod = @__(@Override))
    private PackageIdentifier parentPackageIdentifier;

    private String name;
}
