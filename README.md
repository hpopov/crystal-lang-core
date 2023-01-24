# CrystalCore HelloWorld example

The aim of this application is to provide a working example of CrystalCore language semantic.  
Currently, a primitive "Hello world" example is being developed, leveraging DDD methodology.

## Gradle modules overview

Currently, this project consists of 2 gradle modules: `meta-lang` and `lang`.  
`meta-lang` provide language abstract syntax in form of Java classes, following Domain Driven Design (package `io.startlefrog.lang.meta.syntax`).

## Domain development conventions

### Implementation

1. *Domain Entities* (concrete implementations) should use Lombok's `@Data` and `@AllArgsConstructor`
1. *Value Objects* should use Lombok's `@Value` and `@AllArgsConstructor` with package access level (**to facilitate testing only!**)
1. Each domain class (or interface) should communicate the purpose summary in javadoc

### Testing

1. Never mock *Value Objects* (except for their own unit tests. See `io.startledfrog.lang.meta.syntax.common.structure.PackageIdentifierTest` for an example)
1. Never mock properties (getters and setters) of *Domain Entities*: only domain logic within an entity should be mocked. Therefore, you can use Mockito spies
1. Use `DomainStubs` to quickly instantiate abstract domain objects: this class always creates pure objects (no mocks), so you can use it either for **domain acceptance tests** or for **unit tests**. Otherwise use `@AllArgsConstructor` or *Factory Method* to create consistent domain object.
1. If there is **more than 2** test cases per method, group them into a `@Nested` class with the name of nested class equal to uppercased method name
