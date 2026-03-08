# Java Core Fundamentals & Console RPG

Welcome to my **Java Core Fundamentals** repository! This project is a comprehensive collection of 30 practical exercises designed to master the core concepts of the Java programming language. 

**Capstone Project:** The repository culminates in a fully functional **Console RPG Game** built entirely from scratch, utilizing the OOP principles, design patterns, file I/O, and modern Java features learned throughout these exercises.

---

## Project Overview

This repository serves as both a learning sandbox and a reference library for my coding journey. It contains solutions to a variety of programming challenges, ranging from basic control flow to advanced object-oriented design and modern Java features (Java 8+). 

### Technologies & Concepts Covered

* **Core Java:** Arrays, Loops (`for`, `for-each`, `while`), `switch` statements, Exception Handling (`try-with-resources`, custom exceptions).
* **OOP (Object-Oriented Programming):** Interfaces, Polymorphism, Encapsulation, Composition, Inheritance.
* **Modern Java (Java 8 - 10+):** * Lambda Expressions
  * Stream API (`java.util.function`)
  * `var` keyword (Local Variable Type Inference)
  * Interface `default` and `static` methods.
* **Data Structures (Collections):** `List`, `Set`, `Map`.
* **File I/O:** `java.nio.file.Files`, ZIP Compression, Object Serialization.
* **Generics & Type Safety.**

---

## Repository Structure

The repository is divided into numbered packages (e.g., `_01`, `_02`, ... `_30`), each representing a specific task. You will also find the `ConsoleRPG` package containing the capstone game project.

---

## The 30 Tasks List

1. How do you store multiple `int` numbers when you know how many there are? How do you do it when they will be added and/or removed during program execution? How do you display them on the console?
2. Create a random string generator for a given text length.
3. Create a Lorem Ipsum text generator.
4. Write a program that stores a variable number of strings and then removes random ones. Display the data on the console before and after the operation.
5. Generate a set of random numbers from a given range. Then find the largest and smallest among them.
6. Store data characterizing a regular prism. Develop a solution that stores data for a known and variable number of prisms. Display information about them on the console.
7. Store data characterizing any prism. Develop a solution that stores data for a known and variable number of prisms. Display information about them on the console.
8. Prepare a solution that modifies the value of given numbers (e.g., increments by 1).
9. Create a program calculating the number of days since the beginning of the semester and until its end. Use classes (e.g., `LocalDateTime`) located in the `java.time` package introduced in Java 8.
10. Practice several refactorings available in modern IDEs (e.g., Safe Delete, Extract Method, Extract Constant, Extract Field, Extract Parameter, Introduce Variable, Rename).
11. Provide examples of using the `break` and `continue` statements.
12. Create a short program using the `switch` statement. Remember the proper use of `break` and `default`.
13. Create a short program using `while` and `do/while` loops. What is the difference between them?
14. We want to store information about different types of devices, each with a different set of features. How do we do this? How can we place them in a common collection and display them on the console?
15. We have completely different entities, but each of them has a common ability, e.g., moving. How to represent this in a program, iterate over them, and execute this ability? You are not allowed to use a common superclass.
16. Provide an example of using your own custom exception class and utilizing it with the `throw` statement.
17. Suppose we need to store information about, for example, engines. They have some common features, and one of them is the engine type. How to do this? What will a method look like that does different things depending on the engine type? Provide two ways to solve this problem and their pros/cons.
18. Provide examples of business requirements that can be implemented using different types of containers. Create such implementations for: a. native array, b. list, c. set, d. map. Add objects, remove some, search, and display contents.
19. Why are generics used in Java? Create sample programs utilizing this concept in the implementation of classes and methods.
20. Provide an example of using the `for-each` loop.
21. Save random strings to a file. Then read them and display them on the console.
22. Save/read example data describing a person to/from a file. Try to make them take up as little space as possible. Consider using the `ZipOutputStream` class.
23. Display a list of files in a given directory. Check if there is a file whose name contains a given text.
24. Provide an example of using the `try-with-resources` statement in Java.
25. Provide an example of using the diamond operator `<>` in Java. What are its advantages/disadvantages?
26. Create an example utilizing a default method implementation inside an interface (requires Java 8+).
27. Create an example using lambda expressions in Java.
28. Create a collection of business objects (e.g., Product), and then: a. filter those that meet specific requirements, b. calculate their total value, c. determine if it is less than a given threshold. Use functional interfaces from the `java.util.function` package.
29. Provide examples of using the `var` keyword in Java (requires Java 10+). How does it relate to strong type checking and the analogous keyword in JavaScript?
30. Prepare a program comparing the performance of different types of collections (e.g., list, map, set) in insertion, addition, searching, and removal operations.

---
