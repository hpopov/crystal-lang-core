package io.startledfrog.lang.meta.syntax.common.structure;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import io.startledfrog.lang.meta.infrastructure.CorruptedValueException;
import io.startledfrog.lang.meta.infrastructure.SyntaxViolationException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class PackageIdentifier {

    private static final String LOWERCASE_TOKEN = "[a-z0-9]+";
    private static final String CAMEL_CASE_TOKEN = "([A-Z][a-z0-9]+)+";
    private static final String URI_TOKEN = String.format("(%s|%s)", LOWERCASE_TOKEN, CAMEL_CASE_TOKEN);

    private static final Predicate<String> uriPatternMatchPredicate = Pattern
            .compile("^" + URI_TOKEN + "([.]" + URI_TOKEN + ")*$")
            .asMatchPredicate();

    /**
     * Factory method. </br>
     * Throws:
     * <ul>
     * <li>{@link CorruptedValueException} -- if <code>uri</code> is
     * <code>null</code></li>
     * <li>{@link SyntaxViolationException} -- if <code>uri</code> is does not
     * match uri pattern</li>
     * </ul>
     * 
     * @param uri -- package URI
     * @return valid {@link PackageIdentifier}
     */
    public static PackageIdentifier ofUri(String uri) {
        if (uri == null) {
            throw new CorruptedValueException("parameter 'uri' must not be null");
        }
        if (uriPatternMatchPredicate.test(uri)) {
            return new PackageIdentifier(uri);
        }
        throw new SyntaxViolationException(
                String.format("Uri '%s' is invalid. Follow the 'name.AnotherName.someth1n9' pattern", uri));
    }

    private String uri;

    public PackageIdentifier concat(PackageIdentifier other) {
        return new PackageIdentifier(this.getUri() + "." + other.getUri());
    }

    public PackageIdentifier child(String subpackageName) {
        return concat(ofUri(subpackageName));
    }
}
