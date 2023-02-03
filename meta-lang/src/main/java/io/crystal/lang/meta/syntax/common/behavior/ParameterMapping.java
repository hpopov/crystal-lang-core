package io.crystal.lang.meta.syntax.common.behavior;

import io.crystal.lang.meta.infrastructure.CorruptedValueException;
import io.crystal.lang.meta.syntax.common.behavior.value.Value;
import io.crystal.lang.meta.syntax.common.structure.Parameter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class ParameterMapping {

    public static ParameterMapping ofParameter(Parameter parameter) {
        if (parameter == null) {
            throw new CorruptedValueException("parameter 'parameter' must not be null");
        }
        return new ParameterMapping(parameter);
    }

    private final Parameter parameter;

    private Value mappedValue;

    public boolean isValid() {
        if (mappedValue != null) {
            return mappedValue.isAssignableTo(parameter.getType());
        }
        return false;
    }

    public void removeValue() {
        mappedValue = null;
    }
}
