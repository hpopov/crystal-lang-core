package io.startledfrog.lang.meta.syntax.common.structure;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Package {
    private String Uri;
    private List<Package> nestedPackages;
    private List<Packagable> nestedElements;
}
