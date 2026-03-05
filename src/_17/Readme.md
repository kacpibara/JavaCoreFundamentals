# Task 17: Handling Different Engine Types

This task demonstrates two completely different approaches to solving the same architectural problem: how to execute different behaviors based on the object's type.

## 1. The "Old School" Way (Enum & Switch)
Located in `OldWayWithEnumAndSwitch` package. We use a single `BasicEngine` class and check its behavior using a `switch` statement based on an `EngineType` enum.

**Pros (Zalety):**
* Very easy to read for beginners.
* All the logic for every engine is kept in one single file.

**Cons (Wady):**
* Violates the **Open/Closed Principle (SOLID)**. Every time we want to add a new engine type (e.g., `NUCLEAR`), we MUST modify the existing `BasicEngine` class and add a new `case` to the switch statement.
* With 50 different engine types, the `switch` statement becomes massive and unmaintainable.

---

## 2. The "Modern OOP" Way (Polymorphism)
Located in `NewWayPolimorphism` package. We create a common contract (the `AdvancedEngine` interface) and let each specific engine class implement its own `start()` logic.

**Pros (Zalety):**
* Follows the **Open/Closed Principle**. The code is open for extension, but closed for modification.
* If we want to add a `NuclearEngine`, we just create a new class. We don't have to touch or modify any existing code!
* Extremely scalable and clean.

**Cons (Wady):**
* Creates more files (one for each engine type), which might seem like overkill for very simple applications.