# OOPs – Outside Package

This package demonstrates **Java access modifiers outside the original package**.

## Classes

### `Result`
- Extends `Student`
- Demonstrates access in **outside package + subclass** scenario

Accessible members:
- `protected`
- `public`

Not accessible:
- `private`
- default (package-private)

### `Main`
- Non-subclass class
- Demonstrates access in **outside package + non-subclass** scenario

Accessible members:
- `public` only

## Key Observations
- `protected` members are accessible outside the package **only through inheritance**
- Non-subclass classes can access **only public members**

## Purpose
This package completes all access-modifier cases:
- Same package
- Outside package
- Subclass vs non-subclass
