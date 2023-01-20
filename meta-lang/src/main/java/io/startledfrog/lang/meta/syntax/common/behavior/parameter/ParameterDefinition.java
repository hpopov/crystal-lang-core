package io.startledfrog.lang.meta.syntax.common.behavior.parameter;

import io.startledfrog.lang.meta.syntax.common.structure.Type;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ParameterDefinition {

    private String parameterName;
    private Type parameterType;
}
