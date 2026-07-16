# 33. Search in Rotated Sorted Array

- **Approach:** optimal
- **Difficulty:** Medium
- **Link:** [search-in-rotated-sorted-array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
- **Language:** java
- **File:** [`33. Search in Rotated Sorted Array.java`](33.%20Search%20in%20Rotated%20Sorted%20Array.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 43.9 MB

## Notes

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

_Last updated: 2026-07-17_
