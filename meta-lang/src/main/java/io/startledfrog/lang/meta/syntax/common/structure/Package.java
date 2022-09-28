package io.startledfrog.lang.meta.syntax.common.structure;

import java.util.List;

import lombok.Data;


@Data
public class Package {
    private String Uri;
    private List<Package> nestedPackages;
    private List<Packagable> nestedElements;
}
