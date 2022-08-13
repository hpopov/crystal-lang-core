package io.startledfrog.lang.meta.syntax;

public interface Packagable {
    Package getParentPackage();
    void setParentPackage(Package thePackage);
}
