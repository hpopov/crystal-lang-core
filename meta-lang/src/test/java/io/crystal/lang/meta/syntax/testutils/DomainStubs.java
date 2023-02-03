package io.crystal.lang.meta.syntax.testutils;

import java.util.Collection;
import java.util.List;

import io.crystal.lang.meta.syntax.common.behavior.value.Value;
import io.crystal.lang.meta.syntax.common.structure.Operation;
import io.crystal.lang.meta.syntax.common.structure.PackageIdentifier;
import io.crystal.lang.meta.syntax.common.structure.Parameter;
import io.crystal.lang.meta.syntax.common.structure.Type;

/**
 * A utility class to instantiate abstract classes of <i>Domain
 * Entities</i>.</br>
 * </br>
 * Should only be used for testing purposes.
 */
public class DomainStubs {

    /**
     * Creates {@link Type} stub, splitting <code>fullName</code> into package
     * Uri and type name
     * 
     * @param fullName Fully qualified name of the {@link Type} in the
     *                 <i>"some.package.name.TypeName"</i> format
     * @return {@link Type} stub
     */
    public static Type typeStub(String fullName) {
        int uriTypeDelimiter = fullName.lastIndexOf(".");
        String packageUri = fullName.substring(0, uriTypeDelimiter);
        String typeName = fullName.substring(uriTypeDelimiter);

        return new Type(PackageIdentifier.ofUri(packageUri), typeName) {
        };
    }

    public static Operation operationStub(String name, Parameter... ownedParameters) {
        return new Operation() {

            @Override
            public String getName() {
                return name;
            };

            @Override
            public Collection<Parameter> getOwnedParameters() {
                return List.of(ownedParameters);
            }
        };
    }

    public static Value valueStub(Type type) {
        return new Value() {

            @Override
            public Type getType() {
                return type;
            }
        };
    }
}
