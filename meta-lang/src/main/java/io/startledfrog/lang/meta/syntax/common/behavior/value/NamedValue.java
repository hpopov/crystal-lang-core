package io.startledfrog.lang.meta.syntax.common.behavior.value;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NamedValue {

    private String name;
    private Value value;
}
