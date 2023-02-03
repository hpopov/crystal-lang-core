package io.crystal.lang.meta.syntax.common.behavior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import io.crystal.lang.meta.infrastructure.CorruptedValueException;
import io.crystal.lang.meta.syntax.common.behavior.value.Value;
import io.crystal.lang.meta.syntax.common.structure.Parameter;

public class ParameterMappingTest {

    @Test
    void ofParameter_shouldThrowException_whenParameterIsNull() {
        Exception ex = assertThrows(CorruptedValueException.class, () -> ParameterMapping.ofParameter(null));
        assertEquals("parameter 'parameter' must not be null", ex.getMessage());
    }

    @Test
    void ofParameter_shouldCreateParameterMapping_whenParameterIsNotNull() {
        ParameterMapping actual = ParameterMapping.ofParameter(mock(Parameter.class));
        assertNotNull(actual);
    }

    @Nested
    class IsValid {

        ParameterMapping underTest = new ParameterMapping(mock(Parameter.class));

        @Test
        void isValid_shouldReturnFalse_whenValueNotSet() {
            assertFalse(underTest.isValid());
        }

        @Test
        void isValid_shouldReturnFalse_whenNotAssignableValueIsSet() {
            Value value = mock(Value.class);
            when(value.isAssignableTo(any())).thenReturn(false);
            underTest.setMappedValue(value);

            assertFalse(underTest.isValid());
        }

        @Test
        void isValid_shouldReturnTrue_whenAssignableValueIsSet() {
            Value value = mock(Value.class);
            when(value.isAssignableTo(any())).thenReturn(true);
            underTest.setMappedValue(value);

            assertTrue(underTest.isValid());
        }
    }

    @Test
    void removeValue_shouldSetMappedValueToNull() {
        ParameterMapping underTest = new ParameterMapping(mock(Parameter.class));
        underTest.removeValue();

        assertNull(underTest.getMappedValue());
    }
}
