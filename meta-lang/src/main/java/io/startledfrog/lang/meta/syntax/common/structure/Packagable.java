package io.startledfrog.lang.meta.syntax.common.structure;

public interface Packagable {

    PackageIdentifier getParentPackageIdentifier();

    void setParentPackageIdentifier(PackageIdentifier parentPackageIdentifier);
}
