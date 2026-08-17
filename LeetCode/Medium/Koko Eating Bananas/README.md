# 875. Koko Eating Bananas

- **Difficulty:** Medium
- **Link:** [koko-eating-bananas](https://leetcode.com/problems/koko-eating-bananas/)
- **Language:** java
- **File:** [`875. Koko Eating Bananas.java`](875.%20Koko%20Eating%20Bananas.java)
- **Time complexity:** O(n × log(maxPile))
- **Space complexity:** O(1)
- **Runtime:** 7 ms
- **Memory:** 47.7 MB

## Notes

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

_Last updated: 2026-08-18_
