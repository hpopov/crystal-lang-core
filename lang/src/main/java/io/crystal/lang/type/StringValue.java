package io.crystal.lang.type;

import io.crystal.lang.meta.syntax.classifiers.simple.PrimitiveType;
import io.crystal.lang.meta.syntax.common.behavior.value.PrimitiveValue;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class StringValue extends PrimitiveValue {

    public static StringValue of(String literal) {
        return new StringValue(literal);
    }

    private String literal;

    @Override
    public PrimitiveType getType() {
        return String.instance();
    }
}
