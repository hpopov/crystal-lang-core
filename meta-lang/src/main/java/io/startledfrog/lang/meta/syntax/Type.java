package io.startledfrog.lang.meta.syntax;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Type implements Packagable {

    @Getter(onMethod = @__(@Override))
    @Setter(onMethod = @__(@Override))
    private Package parentPackage;

    private String name;
    
}
