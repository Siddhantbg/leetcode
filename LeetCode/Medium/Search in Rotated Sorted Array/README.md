# 33. Search in Rotated Sorted Array

- **Difficulty:** Medium
- **Link:** [search-in-rotated-sorted-array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- **Language(s):** java
- **Solutions:** 4

## ⭐ Best

**Optimal** (java) — O(log n) time · O(1) space

## Solutions

### ⭐ Optimal

- **Language:** java
- **Complexity:** O(log n) time · O(1) space *
- **Pattern:** Binary search
- **File:** [`33. Search in Rotated Sorted Array.java`](optimal/33.%20Search%20in%20Rotated%20Sorted%20Array.java)
- **Details:** [README](optimal/README.md)

• In every iteration, at least ONE half of the array is sorted.

• First identify the sorted half:
    nums[low] <= nums[mid]
    => Left half is sorted.
    Otherwise, right half is sorted.

• After identifying the sorted half,
  check if the target lies inside it.

• If target lies in the sorted half,
    search there.
  Otherwise,
    search the other half.

• Do NOT find the pivot separately.
  The problem is solvable in a single Binary Search.

• This approach works only because there are NO duplicate elements.
  With duplicates, the logic changes (LeetCode 81).

### Solution 4

- **Language:** java
- **Complexity:** O(log n) time · O(1) space *
- **Pattern:** Binary search
- **LeetCode:** 0 ms · 43.5 MB
- **File:** [`33. Search in Rotated Sorted Array.java`](solution-4/33.%20Search%20in%20Rotated%20Sorted%20Array.java)
- **Details:** [README](solution-4/README.md)

### Brute Force

- **Language:** java
- **Complexity:** O(n) time · O(1) space *
- **File:** [`33. Search in Rotated Sorted Array.java`](brute-force/33.%20Search%20in%20Rotated%20Sorted%20Array.java)
- **Details:** [README](brute-force/README.md)

### Primary

- **Language:** java
- **Complexity:** — time · — space
- **File:** [`33. Search in Rotated Sorted Array.java`](33.%20Search%20in%20Rotated%20Sorted%20Array.java)

<sub>* Complexity auto-detected from the code; edit it in the extension popup if it looks off.</sub>

_Last updated: 2026-11-21_
