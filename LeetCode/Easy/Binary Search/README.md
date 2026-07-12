# 704. Binary Search

- **Difficulty:** Easy
- **Link:** [binary-search](https://leetcode.com/problems/binary-search/)
- **Language:** java
- **File:** [`704. Binary Search.java`](704.%20Binary%20Search.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 47.8 MB

## Notes

• Binary Search works only when the search space is sorted or monotonic.

• Always calculate middle as:
  mid = low + (high - low) / 2
  to avoid integer overflow.

• Search space is always [low, high].

• Loop condition should be:
  while (low <= high)

• If arr[mid] < target:
      low = mid + 1

• If arr[mid] > target:
      high = mid - 1

• Never use:
      low = mid
      high = mid
  as it can lead to an infinite loop.

• Binary Search reduces the search space by half every iteration.

_Last updated: 2026-07-12_
