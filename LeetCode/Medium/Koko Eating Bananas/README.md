# 875. Koko Eating Bananas

- **Difficulty:** Medium
- **Link:** [koko-eating-bananas](https://leetcode.com/problems/koko-eating-bananas/)
- **Language(s):** java
- **Solutions:** 2

## Solutions

### Solution 2

- **Language:** java
- **Complexity:** O(n log n) time · O(1) space *
- **Pattern:** Binary search
- **LeetCode:** 8 ms · 47.6 MB
- **File:** [`875. Koko Eating Bananas.java`](solution-2/875.%20Koko%20Eating%20Bananas.java)
- **Details:** [README](solution-2/README.md)

### Primary

- **Language:** java
- **Complexity:** O(n × log(maxPile)) time · O(1) space *
- **Pattern:** Binary search
- **File:** [`875. Koko Eating Bananas.java`](875.%20Koko%20Eating%20Bananas.java)

• Binary Search on Answer.

• Search space = [1, max(piles)].

• Compute:
    hours = Σ ceil(pile / speed)

• If hours <= h:
    Current speed works.
    Search LEFT for a smaller valid speed.

• If hours > h:
    Speed is too slow.
    Search RIGHT.

• Return low after Binary Search ends.

• Avoid Math.ceil().
  Use:
    (pile + speed - 1) / speed

• This problem has the exact same pattern as:
    - Smallest Divisor
    - Minimum Days to Make Bouquets
    - Ship Packages Within D Days
    - Capacity to Ship Packages

<sub>* Complexity auto-detected from the code; edit it in the extension popup if it looks off.</sub>

_Last updated: 2026-11-21_
