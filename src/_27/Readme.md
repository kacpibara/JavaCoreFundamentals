# Task 27: Lambda Expressions

Lambda expressions (introduced in Java 8) are a short block of code which takes in parameters and returns a value. They provide a clear and concise way to represent a method of a **Functional Interface** (an interface with exactly one abstract method).

## The Syntax
A lambda expression is divided into three parts:
`(parameters) -> { body of the function }`

1. **Parameters:** E.g., `(a, b)`. If there's only one parameter, you can omit the parentheses: `target -> ...`
2. **Arrow Operator (`->`):** Separates the parameters from the body. It essentially means "becomes" or "do this".
3. **Body:** The actual code to execute. If it's a single line, you can omit the curly braces `{}` and the `return` keyword.

## Examples in Action
**Old Way (Anonymous Inner Class):**
```java
heroes.sort(new Comparator<String>() {
    @Override
    public int compare(String h1, String h2) {
        return h1.compareTo(h2);
    }
});
```

New Way (Lambda Expression):

Java

```heroes.sort((h1, h2) -> h1.compareTo(h2));```

Why use Lambdas?

- Drastically reduces boilerplate code (makes code shorter and easier to read).
- Enables Functional Programming in Java (treating functions/actions as variables).
- Perfect match for the Streams API and Collections (forEach, removeIf, filter, map).