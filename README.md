# 🚀 DSA in Java - Complete Mastery Guide

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
![Contributors](https://img.shields.io/badge/Contributors-Welcome-blue?style=for-the-badge)

**A comprehensive, production-ready collection of Data Structures and Algorithms implementations in Java**

[Quick Start](#-quick-start) • [Algorithms](#-algorithms) • [Data Structures](#-data-structures) • [Learning Path](#-learning-path) • [Contribute](#-contributing)

</div>

---

## ✨ What's Inside

This repository contains **86+ carefully crafted implementations** covering fundamental to advanced DSA concepts, all optimized for learning and production use.

- 🔍 **9 Searching Algorithms** - From linear to advanced binary search variants
- 🔄 **6 Sorting Algorithms** - Complete implementations with complexity analysis
- 🔗 **15+ Recursion & Backtracking** - Complex problem-solving patterns
- 🎯 **Advanced Backtracking** - Maze solving, N-Queens, permutations
- ⚡ **Dynamic Programming** - Optimization techniques and memoization
- 📊 **Array & Matrix Operations** - Prefix sums, rotations, transformations
- 📦 **Data Structures** - Stack and Queue implementations
- 🧮 **Utility Algorithms** - Mathematical and string operations

---

## 🎯 Algorithms at a Glance

### 🔍 Searching Algorithms
| Algorithm | File | Complexity | Best For |
|-----------|------|-----------|----------|
| Linear Search | `LinearSearch.java` | O(n) | Unsorted arrays |
| Binary Search | `BinarySearch.java` | O(log n) | Sorted arrays |
| Binary Search (Recursive) | `BinarySearchRecursion.java` | O(log n) | Educational purposes |
| Floor & Ceiling | `FloorAndCeiling.java` | O(log n) | Range queries |
| Square Root | `SquareRoot.java` | O(log n) | Precise calculations |

### 🔄 Sorting Algorithms
| Algorithm | File | Time | Space | Stable |
|-----------|------|------|-------|--------|
| Bubble Sort | `BubbleSort.java` | O(n²) | O(1) | ✅ |
| Bubble Sort (Recursive) | `BubbleSortRecursive.java` | O(n²) | O(n) | ✅ |
| Selection Sort | `SelectionSort.java` | O(n²) | O(1) | ❌ |
| Insertion Sort | `InsertionSort.java` | O(n²) | O(1) | ✅ |
| Merge Sort | `mergedSort.java` | O(n log n) | O(n) | ✅ |
| Quick Sort | `quickSort.java` | O(n log n)* | O(log n) | ❌ |

### 🧠 Recursion & Backtracking
| Problem | File | Time | Applications |
|---------|------|------|--------------|
| Factorial | `FactorialRecursion.java` | O(n) | Mathematical calculations |
| Fibonacci | `FibonacciRecursion.java` | O(2^n)* | Dynamic programming foundation |
| Power Function | `PowerRecursion.java` | O(log n) | Exponentiation |
| Permutations | `PermutationRecursion.java` | O(n!) | Combinatorial problems |
| Subsequences | `printSubSeq.java` | O(2^n) | String processing |
| Maze Paths | `mazePath.java` | O(2^(m+n)) | Path finding |
| N-Queens Problem | `queenProblem.java` | O(n!) | Constraint satisfaction |

### 🎯 Advanced Backtracking
- **Maze Solver** (`mazePath.java`) - Navigate through grid mazes
- **Diagonal Maze** (`mazePathDiagonal.java`) - Maze with all 8 directions
- **Board Paths** (`boardPath.java`) - Count ways to reach destination
- **N-Queens Problem** (`queenProblem.java`) - Classic constraint problem
- **N-Queens with Constraints** (`QueenProblemBoxRespect.java`) - Advanced variant

### ⚡ Dynamic Programming
- **Coin Change** (`coinChange.java`) - Minimum coins for target sum
- **Count Ways** (`CountWays.java`) - Count possible combinations

### 📊 Arrays & Matrix Operations
| Operation | File | Complexity |
|-----------|------|-----------|
| Reverse Array | `ReverseArray.java` | O(n) |
| Prefix Sum (In-place) | `InPlacePrefixSum.java` | O(n) |
| 2D Prefix Sum | `PrefixSumMatrix.java` | O(m×n) |
| Matrix Rotation | `RotationOfMatrix.java` | O(m×n) |
| Find Duplicates | `FindDuplicates.java` | O(n) |
| Find Missing Number | `MissingNo.java` | O(n) |

### 📦 Data Structures
| Structure | Files | Operations |
|-----------|-------|-----------|
| Stack | `Stack.java`, `StackClient.java` | Push, Pop, Peek - O(1) |
| Queue | `QueueImplementation.java` | Enqueue, Dequeue - O(1) |
| Queue (Advanced) | `myqueue/` | Various queue implementations |
| Stack (Advanced) | `mystack/` | Stack-based problems |

---

## 🚀 Quick Start

### Prerequisites
```bash
✓ Java 8 or higher
✓ Any IDE (IntelliJ, Eclipse, VS Code)
✓ Basic Java knowledge
```

### Installation
```bash
# Clone the repository
git clone https://github.com/yourusername/dsa-java.git
cd dsa-java

# Navigate to any file and compile
javac LinearSearch.java
java LinearSearch
```

### Running Your First Program
```bash
# Example: Run Binary Search
javac BinarySearch.java
java BinarySearch

# Example: Solve N-Queens
javac queenProblem.java
java queenProblem

# Example: Sort with Quick Sort
javac quickSort.java
java quickSort
```

---

## 📁 Repository Structure

```
dsa-java/
│
├── 🔍 SEARCHING ALGORITHMS
│   ├── LinearSearch.java
│   ├── BinarySearch.java
│   ├── BinarySearchRecursion.java
│   ├── FloorAndCeiling.java
│   └── SquareRoot.java
│
├── 🔄 SORTING ALGORITHMS
│   ├── BubbleSort.java
│   ├── BubbleSortRecursive.java
│   ├── SelectionSort.java
│   ├── InsertionSort.java
│   ├── mergedSort.java
│   ├── quickSort.java
│   └── SortedArrayOrNot.java
│
├── 🧠 RECURSION & BACKTRACKING
│   ├── FactorialRecursion.java
│   ├── FibonacciRecursion.java
│   ├── PowerRecursion.java
│   ├── PermutationRecursion.java
│   ├── printSubSeq.java
│   ├── AllSubsequencesString.java
│   ├── FirstIndex.java
│   ├── LastIndex.java
│   └── AllIndices.java
│
├── 🎯 ADVANCED BACKTRACKING
│   ├── mazePath.java
│   ├── mazePathDiagonal.java
│   ├── boardPath.java
│   ├── queenProblem.java
│   └── QueenProblemBoxRespect.java
│
├── ⚡ DYNAMIC PROGRAMMING
│   ├── coinChange.java
│   └── CountWays.java
│
├── 📊 ARRAYS & MATRIX
│   ├── ReverseArray.java
│   ├── InPlacePrefixSum.java
│   ├── PrefixSumMatrix.java
│   ├── RotationOfMatrix.java
│   ├── FindDuplicates.java
│   └── MissingNo.java
│
├── 📦 DATA STRUCTURES
│   ├── Stack.java
│   ├── StackClient.java
│   ├── QueueImplementation.java
│   ├── mystack/
│   └── myqueue/
│
├── 🧮 UTILITY ALGORITHMS
│   ├── AlternativeSumSeries.java
│   ├── SumDigits.java
│   ├── PrintMultiples.java
│   ├── Palindrome.java
│   ├── Factorial.java
│   ├── Power.java
│   └── Fibonacci.java
│
└── 📋 Configuration
    └── .gitignore
```

---

## 📈 Complexity Cheat Sheet

### Time Complexity
```
O(1)        - Constant        ▓░░░░░░░░░ Excellent
O(log n)    - Logarithmic    ▓▓░░░░░░░░ Very Good
O(n)        - Linear          ▓▓▓░░░░░░░ Good
O(n log n)  - Linearithmic   ▓▓▓▓░░░░░░ Fair
O(n²)       - Quadratic       ▓▓▓▓▓░░░░░ Poor
O(2^n)      - Exponential    ▓▓▓▓▓▓▓▓▓░ Very Poor
O(n!)       - Factorial       ▓▓▓▓▓▓▓▓▓▓ Terrible
```

### Space Complexity
```
O(1)        - Constant space (no extra memory needed)
O(log n)    - Logarithmic space (recursion depth)
O(n)        - Linear space (proportional to input)
O(n²)       - Quadratic space (2D arrays)
```

---

## 🎓 Learning Path

### Level 1️⃣: Fundamentals (Week 1-2)
Start here if you're new to DSA
- [x] Array Basics & Reverse Array
- [x] Linear Search
- [x] Sorting Fundamentals (Bubble, Selection, Insertion)
- [x] Basic Recursion (Factorial, Power)

### Level 2️⃣: Intermediate (Week 3-4)
Build on fundamentals
- [x] Binary Search & Variants
- [x] Advanced Sorting (Merge, Quick Sort)
- [x] Fibonacci & Sequence Problems
- [x] Prefix Sum Concepts
- [x] Matrix Operations

### Level 3️⃣: Advanced (Week 5-6)
Master complex patterns
- [x] Backtracking Fundamentals
- [x] Maze Solving
- [x] Permutations & Combinations
- [x] N-Queens Problem
- [x] Subsequence Generation

### Level 4️⃣: Expert (Week 7-8)
Industry-level optimization
- [x] Dynamic Programming
- [x] Coin Change Problem
- [x] Stack & Queue Applications
- [x] Complex Backtracking with Constraints
- [x] Algorithm Optimization

---

## 💻 Code Example

### Binary Search Implementation
```java
// Simple yet powerful - O(log n) time complexity
public static void binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            System.out.println("Found at index: " + mid);
            return;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    System.out.println("Element not found");
}
```

### N-Queens Problem
```java
// Solve the classic constraint satisfaction problem
// Find all ways to place N queens on N×N chessboard
// No two queens can attack each other
```

---

## 🌟 Key Features

✅ **Well-Documented** - Every algorithm includes comments explaining logic  
✅ **Production-Ready** - Clean, optimized, industry-standard code  
✅ **Beginner-Friendly** - Start from basics and advance progressively  
✅ **Interview-Ready** - All commonly asked DSA questions covered  
✅ **Complexity Analysis** - Time & space complexity for each algorithm  
✅ **Multiple Approaches** - Iterative and recursive implementations  
✅ **Easy to Navigate** - Organized by category and difficulty  
✅ **Active Maintenance** - Regular updates and improvements  

---

## 🧪 Testing & Benchmarks

To test the algorithms locally:

```bash
# Create a test file
javac YourAlgorithm.java
java YourAlgorithm

# With custom inputs
echo "5" | java Factorial
echo "100 50 75 25" | java BubbleSort
```

---

## 📚 Resources & References

### Recommended Learning Resources
- [GeeksforGeeks DSA](https://www.geeksforgeeks.org/data-structures/)
- [LeetCode Practice](https://leetcode.com/)
- [HackerRank Tutorials](https://www.hackerrank.com/domains/tutorials/10-days-of-javascript)
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)

### Books
- "Introduction to Algorithms" - CLRS
- "Cracking the Coding Interview" - McDowell

---

## 🤝 Contributing

We welcome contributions! Here's how to help:

### Ways to Contribute
- ➕ Add new algorithms or data structures
- 📝 Improve existing implementations with better comments
- 🐛 Fix bugs and optimize code
- 📖 Add documentation and examples
- ✅ Add test cases
- 🎨 Improve code quality and style

### Contribution Steps
```bash
# 1. Fork the repository
# 2. Create a feature branch
git checkout -b feature/new-algorithm

# 3. Commit your changes
git commit -m "Add: XYZ algorithm with O(n) complexity"

# 4. Push to your fork
git push origin feature/new-algorithm

# 5. Open a Pull Request
```

### Contribution Guidelines
- Follow Java naming conventions
- Add time & space complexity comments
- Include example usage
- Write clean, readable code
- Add brief documentation

---

## 📊 Repository Stats

```
Total Files        : 86+
Total Algorithms   : 50+
Total Data Structures : 3+
Total LOC          : 5000+
Coverage           : Beginner to Advanced
Difficulty Levels  : 4 (Foundation → Expert)
```

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

You are free to:
- ✅ Use commercially
- ✅ Modify
- ✅ Distribute
- ✅ Use privately

---

## 🙋 Support & FAQ

**Q: Where should I start?**  
A: Start with Level 1 learning path. Begin with Array Basics and Linear Search.

**Q: How do I run these programs?**  
A: `javac FileName.java` then `java FileName`

**Q: Do you have test cases?**  
A: Each file has example inputs in the main method. Run the file to see output.

**Q: Can I use this for interviews?**  
A: Absolutely! This covers most common interview questions.

**Q: How often is this updated?**  
A: Regularly! New algorithms and improvements are added frequently.

---

## 📞 Connect With Me

<div align="center">

*Building secure, scalable solutions with modern technology*

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/soham-bagal-4343bb284)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/bagalsoham)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:bagalsoham1717@gmail.com)
[![WhatsApp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](tel:+919967550047)

</div>

---

## ⭐ Show Your Support

If this repository helped you, please give it a ⭐ star! It motivates contributors to create better content.

```
Your support = Our motivation to improve! 🚀
```

---

<div align="center">

**Made with ❤️ for learners and developers worldwide**

**Happy Coding! 🎓 Keep Learning, Keep Growing! 📈**

[⬆ Back to Top](#-dsa-in-java---complete-mastery-guide)

</div>
