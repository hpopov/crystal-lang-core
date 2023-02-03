package io.crystal.lang.meta.syntax.common.structure;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Package {

    private PackageIdentifier identifier;
    private List<Package> nestedPackages;
    private List<Packagable> nestedElements;
}
