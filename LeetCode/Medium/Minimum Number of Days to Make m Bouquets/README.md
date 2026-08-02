# 1482. Minimum Number of Days to Make m Bouquets

- **Difficulty:** Medium
- **Link:** [minimum-number-of-days-to-make-m-bouquets](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)
- **Language:** java
- **File:** [`1482. Minimum Number of Days to Make m Bouquets.java`](1482.%20Minimum%20Number%20of%20Days%20to%20Make%20m%20Bouquets.java)
- **Time complexity:** O(n*log(maxDay-minDay))
- **Space complexity:** O(1)
- **Runtime:** 17 ms
- **Memory:** 82.8 MB

## Notes

• Binary Search on Answer.

• Search space = [minimum bloom day, maximum bloom day].

• First check:
    if (m * k > n)
        return -1.

• Feasibility function:
    Count consecutive bloomed flowers.
    Every k consecutive flowers form one bouquet.

• If current day works:
    Search LEFT for an earlier valid day.

• If current day doesn't work:
    Search RIGHT.

• The consecutive condition is crucial.
  You cannot combine flowers from different segments.

• Pattern:
    Binary Search + Feasibility Check.

_Last updated: 2026-08-03_
