# Task 18: Data Structures & Business Requirements

This project demonstrates the use of four basic Java data containers (Array, List, Set, Map) by simulating a business system for **The Goblin's Magic Shop**. Each data structure was chosen to solve a specific business problem.

## 1. Native Array (`String[]`)
* **Business Requirement:** Top 3 Bestselling Items.
* **Why this container?** Native arrays have a strictly fixed size. Since a podium always has exactly 3 places (no more, no less), an array is the perfect, memory-efficient choice.
* **Drawback:** Arrays cannot shrink or grow dynamically. To "remove" an item, we have to manually set its index to `null`.

## 2. List (`ArrayList`)
* **Business Requirement:** Customer's Shopping Cart.
* **Why this container?** A List maintains the order of inserted elements and, most importantly, **allows duplicates**. If a customer wants to buy two identical "Health Potions", the List will store both of them without any issues.

## 3. Set (`HashSet`)
* **Business Requirement:** Unique Promo Codes.
* **Why this container?** A Set automatically rejects duplicate values. In a business scenario where multiple users might try to generate or input the same discount code, a Set guarantees that our database will only store unique codes.

## 4. Map (`HashMap`)
* **Business Requirement:** Store Inventory (Stock Management).
* **Why this container?** A Map stores data in `Key-Value` pairs. It allows us to perfectly map an item's name (the Key, e.g., "Dragon Egg") to its current available quantity (the Value, e.g., 50).

---

## Technical Highlight: The `removeIf` Method

In this task, instead of writing long and complex `for` loops to find and remove items, I used the modern Java **`removeIf`** method combined with **Lambda expressions**.

### How does it work?
```java
promoCodes.removeIf(code -> code.length() < 4);
//
inventory.entrySet().removeIf(entry -> entry.getValue() == 0);
```

The removeIf method iterates through the entire collection automatically. 
<br>
The lambda expression inside (code -> code.length() < 4) acts as a filter.

Benefits:
- Cleaner Code: It replaces 5-6 lines of traditional loop code with just 1 line.
- Safety: It prevents the dreaded ConcurrentModificationException that often happens when you try to remove an item from a collection while looping through it the old-fashioned way.


