# Task 25: The Diamond Operator `<>`

The diamond operator was introduced in Java 7 to simplify the instantiation of generic classes. It allows the compiler to infer the type arguments from the context (the variable declaration on the left side).

## Pros (Zalety):
1. **Less Boilerplate Code (Mniej pisania):** Programmers don't have to duplicate the generic types on both sides of the `=` sign.
2. **Better Readability (Lepsza czytelność):** Especially with nested or complex generics like `Map<String, List<Object>>`, the code is much shorter and easier to read.
3. **Maintains Type Safety (Bezpieczeństwo typów):** Even though we write `<>`, the compiler still strictly checks if we are adding the correct objects, just like before.

## Cons / Limitations (Wady i ograniczenia):
1. **The `var` Keyword Conflict:** In modern Java (Java 10+), we can use the `var` keyword. If we combine `var` with the diamond operator (e.g., `var list = new ArrayList<>();`), the compiler doesn't have enough information on the left side to guess the type. It will default to a list of `Object`, which is usually not what we want. We lose strict type safety.
2. **Anonymous Classes (Older Java versions):** Before Java 9, the diamond operator could not be used when creating anonymous inner classes.