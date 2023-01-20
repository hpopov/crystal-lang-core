package io.startledfrog.lang.meta.syntax.common.behavior;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.startledfrog.lang.meta.syntax.common.behavior.parameter.ParameterMapping;
import io.startledfrog.lang.meta.syntax.common.behavior.value.Value;
import io.startledfrog.lang.meta.syntax.common.structure.Operation;
import io.startledfrog.lang.meta.syntax.common.structure.Package;
import io.startledfrog.lang.meta.syntax.common.structure.Parameter;
import io.startledfrog.lang.meta.syntax.common.structure.Type;

public class OperationInvokationStatementTest {

    @Test
    void testIsValid() {
        Type type1 = new Type(
                new Package("io.package", null, null), "Object") {
        };
        ParameterMapping parameterMapping = ParameterMapping.ofParameter(
                new Parameter("par1", type1));

        OperationInvokationStatement underTest = new OperationInvokationStatement(new Operation() {

            @Override
            public String getName() {
                return "testFunction";
            };

            @Override
            public Collection<Parameter> getOwnedParameters() {
                return List.of(
                        new Parameter("par1", type1));
            }
        }, List.of(parameterMapping));

        assertFalse(underTest.isValid());
        parameterMapping.setMappedValue(new Value() {

            @Override
            public Type getType() {
                return type1;
            }
        });
        assertTrue(underTest.isValid());
    }
}
