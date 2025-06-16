# Java

A collection of classic data structures and algorithms implemented in Java.

## Overview

This repository gathers clear and efficient Java implementations of fundamental data structures and algorithms. It is intended as a resource for students, educators, and developers who want to learn, review, or reuse standard Java solutions for common programming problems. The code is organized by topic for ease of navigation.

## Features

- **Data Structures:**  
  Includes stacks, queues, linked lists, trees, heaps, hash tables, and more.
- **Algorithms:**  
  Covers sorting, searching, recursion, dynamic programming, graph algorithms, and more.
- **Object-Oriented Design:**  
  Uses Java best practices and idiomatic code.
- **Educational Focus:**  
  Well-commented and easy to understand.
- **Test Cases:**  
  Example usage and test files are included for many structures and algorithms.
- **No External Dependencies:**  
  Uses only standard Java libraries.

## Example Structure

- `/data_structures/` – Stacks, queues, linked lists, trees, heaps, etc.
- `/algorithms/` – Sorting, searching, dynamic programming, graph algorithms, etc.
- `/tests/` – Example usage and test files.

## Usage

### 1. Clone the repository

```bash
git clone https://github.com/TareqAlKushari/Java.git
cd Java
```

### 2. Compile and Run

Navigate to the directory containing the class you want to run and use `javac` and `java`. For example:

```bash
javac data_structures/Stack.java
javac tests/StackTest.java
java tests.StackTest
```

### 3. Example

```java
// Example: Using Stack class
import data_structures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s.peek()); // 20
        s.pop();
        System.out.println(s.peek()); // 10
    }
}
```

## Contributing

Contributions and suggestions are welcome! Please open an issue or submit a pull request.

## License

This project is licensed under the MIT License.

---

*Created by [TareqAlKushari](https://github.com/TareqAlKushari)*
