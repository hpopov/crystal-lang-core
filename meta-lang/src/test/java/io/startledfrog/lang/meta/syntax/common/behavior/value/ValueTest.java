package io.startledfrog.lang.meta.syntax.common.behavior.value;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import io.startledfrog.lang.meta.syntax.common.structure.Type;
import io.startledfrog.lang.meta.syntax.testutils.DomainStubs;

public class ValueTest {

    /**
     * An <strong>exception</strong> here (using domain stubs instead of mocks):
     * <code>equals()</code> cannot be stubbed
     */
    @Test
    void isAssignableTo_shouldReturnTrue_whenTypesAreEqual() {
        Type type = DomainStubs.typeStub("package.Type");
        Type equalType = DomainStubs.typeStub("package.Type");

        Value underTest = DomainStubs.valueStub(equalType);

        assertTrue(underTest.isAssignableTo(type));
    }

    /**
     * An <strong>exception</strong> here (using domain stubs instead of mocks):
     * <code>equals()</code> cannot be stubbed
     */
    @ParameterizedTest
    @CsvSource(delimiter = ';', value = {
            "package.Type1;package.Type2",
            "some.package.Type;another.package.Type",
            "some.PackAge.Type;some.package.Type3"
    })
    void isAssignableTo_shouldReturnFalse_whenTypesAreNotEqual(String typeName1, String typeName2) {
        Type type = DomainStubs.typeStub(typeName1);
        Type anotherType = DomainStubs.typeStub(typeName2);

        Value underTest = DomainStubs.valueStub(anotherType);

        assertFalse(underTest.isAssignableTo(type));
    }
}
