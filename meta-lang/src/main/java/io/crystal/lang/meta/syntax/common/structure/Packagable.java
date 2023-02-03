package io.crystal.lang.meta.syntax.common.structure;

public interface Packagable {

    PackageIdentifier getParentPackageIdentifier();

    void setParentPackageIdentifier(PackageIdentifier parentPackageIdentifier);
}
