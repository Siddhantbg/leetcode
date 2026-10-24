# 118. Pascal's Triangle

- **Difficulty:** Easy
- **Link:** [pascals-triangle](https://leetcode.com/problems/pascals-triangle/)
- **Language(s):** java
- **Solutions:** 2

## ⭐ Best

**Optimal** (java) — O(m·n) time · O(n) space

## Solutions

### ⭐ Optimal

- **Language:** java
- **Complexity:** O(m·n) time · O(n) space *
- **Pattern:** Nested loops
- **LeetCode:** 1 ms · 43.1 MB
- **File:** [`118. Pascal's Triangle.java`](solution-2/118.%20Pascal's%20Triangle.java)
- **Details:** [README](solution-2/README.md)

### Alternative

- **Language:** java
- **Complexity:** O(n^2) time · O(n^2) space
- **Pattern:** Nested loops
- **LeetCode:** 1 ms · 43.4 MB
- **File:** [`118. Pascal's Triangle.java`](118.%20Pascal's%20Triangle.java)

Dont try to calculate every value using factorials, combination. The triagnle's previous row already gives you exactly what you need.

<sub>* Complexity auto-detected from the code; edit it in the extension popup if it looks off.</sub>

_Last updated: 2026-10-24_
