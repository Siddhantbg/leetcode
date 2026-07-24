# 69. Sqrt(x)

- **Difficulty:** Easy
- **Link:** [sqrtx](https://leetcode.com/problems/sqrtx/)
- **Language:** java
- **File:** [`69. Sqrt(x).java`](69.%20Sqrt(x).java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 1 ms
- **Memory:** 42.7 MB

## Notes

• This is the first classic Binary Search on Answer problem.

• Search space is [1, x], not an array.

• If mid² <= x:
    mid is a valid answer.
    Store it and search RIGHT.

• If mid² > x:
    Search LEFT.

• Return the largest value whose square is <= x.

• Never use:
    mid * mid
  directly with int.
  Use:
    (long) mid * mid
  or
    mid <= x / mid
  to avoid integer overflow.

• Binary Search on Answer is used whenever the answer itself lies in a monotonic range.

_Last updated: 2026-07-25_
