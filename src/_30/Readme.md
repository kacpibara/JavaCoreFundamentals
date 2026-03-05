# Task 30: Collections Performance Comparison

This program measures the execution time (in milliseconds) of inserting, searching, and removing 100,000 elements across `ArrayList`, `HashSet`, and `HashMap`.

## Expected Results & Time Complexity (Big O Notation):

### 1. Adding Elements
* **ArrayList:** Extremely fast **O(1)**. It simply appends the element to the end of its internal array.
* **HashSet / HashMap:** Slightly slower than ArrayList because calculating the Hash Code and bucket placement takes a tiny bit of computational power.

### 2. Searching Elements (`contains`)
* **ArrayList:** Very slow **O(N)**. To find citizen number 99,999, the list has to check every single element starting from 0. It iterates through the whole list!
* **HashSet / HashMap:** Blazing fast **O(1)**. Thanks to the hashing algorithm, the container knows exactly where the element is stored in memory and retrieves it instantly, regardless of whether there are 10 elements or 10 million.

### 3. Removing Elements
* **ArrayList:** Extremely slow **O(N)**. Not only does it have to *find* the element first (which is slow), but after removing it, it has to shift all subsequent elements to the left to fill the gap!
* **HashSet / HashMap:** Instant **O(1)**. Finds the hash bucket instantly and removes the reference.