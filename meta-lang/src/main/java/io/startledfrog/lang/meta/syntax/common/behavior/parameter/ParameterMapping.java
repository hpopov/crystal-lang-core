package io.startledfrog.lang.meta.syntax.common.behavior.parameter;

import io.startledfrog.lang.meta.syntax.common.behavior.value.Value;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ParameterMapping {

    public static ParameterMapping ofParameter(Parameter parameter) {
        return new ParameterMapping(parameter);
    }

    private final Parameter parameter;
    private Value mappedValue;

    public boolean isValid() {
        if (mappedValue == null || parameter == null || parameter.getType() == null) {
            return false;
        }
        return parameter.getType().equals(mappedValue.getType());
    }
}
