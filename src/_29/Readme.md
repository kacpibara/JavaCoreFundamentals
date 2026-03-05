# Task 29: The `var` Keyword (Local Variable Type Inference)

In Java 10, the `var` keyword was introduced to reduce boilerplate code. It allows the compiler to automatically deduce (infer) the type of a local variable from the context (the value assigned to it).

## `var` in Java vs. Strong Typing (Mocna kontrola typów)
Using `var` in Java **does not** break strong, static typing.
When you write `var age = 30;`, the Java compiler translates this into `int age = 30;` under the hood during compilation. The variable `age` is strictly locked as an `int` forever. If you later try to write `age = "Thirty";`, the Java compiler will throw an error.
`var` is simply "syntactic sugar" for the programmer to write less code.

## Java `var` vs. JavaScript `var`
They share the same name, but behave completely differently:

* **JavaScript (Dynamic Typing):** JS is a dynamically typed language. A variable can change its type freely during runtime.
```javascript
  var x = 10;       // x is a Number
  x = "Hello";      // x is now a String. This is PERFECTLY FINE in JS!
```

- Java (Static Typing): Java is a statically typed language. A type is checked at compile-time and can never change.

```Java
    var x = 10;       // Compiler permanently locks 'x' as an int.
    x = "Hello";      // COMPILATION ERROR! Incompatible types.
```

Rules for using var in Java:

- It can only be used for local variables inside methods. You cannot use var for class fields (attributes), method parameters, or return types.
- The variable must be initialized immediately (e.g., var x; is illegal because the compiler doesn't know what type to infer).
- It cannot be initialized with null (e.g., var name = null; is illegal).