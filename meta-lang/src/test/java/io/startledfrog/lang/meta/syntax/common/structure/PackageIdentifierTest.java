package io.startledfrog.lang.meta.syntax.common.structure;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;

import io.startledfrog.lang.meta.infrastructure.CorruptedValueException;
import io.startledfrog.lang.meta.infrastructure.SyntaxViolationException;

public class PackageIdentifierTest {

    @Nested
    class OfUri {

        @Test
        void shouldThrowException_whenUriIsNull() {
            Exception ex = assertThrows(CorruptedValueException.class, () -> PackageIdentifier.ofUri(null));
            assertEquals("parameter 'uri' must not be null", ex.getMessage());
        }

        @ParameterizedTest
        @ValueSource(
            strings = { "uPpercase.in.the.middle", "s pace.in", "ch(r.inva)id", "com,ma", "dash-not.allowed", "",
                    "..name", "P.v" })
        void shouldThrowSyntaxViolationException_whenUriDoesNotMatchFormat(String invalidUri) {
            Exception ex = assertThrows(SyntaxViolationException.class, () -> PackageIdentifier.ofUri(invalidUri));
            assertEquals(
                    String.format("Uri '%s' is invalid. Follow the 'name.AnotherName.someth1n9' pattern", invalidUri),
                    ex.getMessage());
        }

        @ParameterizedTest
        @ValueSource(
            strings = { "i", "uri", "valid.uri", "long.valid.uri.name", "CamelCase.in.uri",
                    "io.CamelCase.in.the.middle",
                    "di9its.permitted" })
        void shouldCreateUri(String validUri) {
            PackageIdentifier result = assertDoesNotThrow(() -> PackageIdentifier.ofUri(validUri));
            assertNotNull(result);
        }
    }

    @Test
    void concat_shouldConcatUrisWithDot() {
        PackageIdentifier underTest = new PackageIdentifier("some.uri");
        PackageIdentifier anotherIdentifier = new PackageIdentifier("SubPackage");

        PackageIdentifier result = underTest.concat(anotherIdentifier);

        assertNotNull(result);
        assertEquals("some.uri.SubPackage", result.getUri());
    }

    @Test
    void child_shouldConcatIdentifierWithSubPackageIdentifier() {
        PackageIdentifier underTest = spy(new PackageIdentifier("some.uri"));
        PackageIdentifier anotherIdentifier = new PackageIdentifier("SubPackage");

        try (MockedStatic<PackageIdentifier> packageIdentifierStaticMock = mockStatic(PackageIdentifier.class)) {
            packageIdentifierStaticMock.when(() -> PackageIdentifier.ofUri(anyString())).thenReturn(anotherIdentifier);

            PackageIdentifier result = underTest.child("SubPackage");

            packageIdentifierStaticMock.verify(() -> PackageIdentifier.ofUri("SubPackage"));
            verify(underTest).concat(anotherIdentifier);
            assertNotNull(result);
            assertEquals("some.uri.SubPackage", result.getUri());
        }
    }
}
