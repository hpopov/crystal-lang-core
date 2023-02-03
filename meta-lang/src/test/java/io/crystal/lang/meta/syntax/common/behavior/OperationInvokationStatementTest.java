package io.crystal.lang.meta.syntax.common.behavior;

import static io.crystal.lang.meta.syntax.testutils.DomainStubs.typeStub;
import static io.crystal.lang.meta.syntax.testutils.DomainStubs.valueStub;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.crystal.lang.meta.syntax.common.structure.Parameter;
import io.crystal.lang.meta.syntax.common.structure.Type;
import io.crystal.lang.meta.syntax.testutils.DomainStubs;

public class OperationInvokationStatementTest {

    @Test
    void testIsValid() {
        Type type = typeStub("io.package.Object");
        Parameter parameter = new Parameter("par1", type);
        ParameterMapping parameterMapping = ParameterMapping.ofParameter(parameter);

        OperationInvokationStatement underTest = new OperationInvokationStatement(
                DomainStubs.operationStub("testFunction", parameter),
                List.of(parameterMapping));

        assertFalse(underTest.isValid());
        parameterMapping.setMappedValue(valueStub(type));
        assertTrue(underTest.isValid());
    }

    @Test
    void testIsNotValid_whenMappedParameterHasDifferentNameThanOperationParameter() {
        Type type = typeStub("io.package.Object");

        Parameter parameter = new Parameter("par1", type);
        ParameterMapping parameterMapping = ParameterMapping.ofParameter(parameter);
        parameterMapping.setMappedValue(valueStub(type));

        Parameter operationParameter = new Parameter("differentParameter", type);

        OperationInvokationStatement underTest = new OperationInvokationStatement(
                DomainStubs.operationStub("testFunction", operationParameter),
                List.of(parameterMapping));

        assertFalse(underTest.isValid());
    }

    @Test
    void testIsNotValid_whenMappedParameterHasDifferentTypeThanOperationParameter() {
        Type type = typeStub("io.package.Object");
        Type operationParameterType = typeStub("io.package.String");

        Parameter parameter = new Parameter("par1", type);
        ParameterMapping parameterMapping = ParameterMapping.ofParameter(parameter);
        parameterMapping.setMappedValue(valueStub(type));

        Parameter operationParameter = new Parameter("par1", operationParameterType);

        OperationInvokationStatement underTest = new OperationInvokationStatement(
                DomainStubs.operationStub("testFunction", operationParameter),
                List.of(parameterMapping));

        assertFalse(underTest.isValid());
    }
}
