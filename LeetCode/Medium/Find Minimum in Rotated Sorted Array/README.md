# 153. Find Minimum in Rotated Sorted Array

- **Difficulty:** Medium
- **Link:** [find-minimum-in-rotated-sorted-array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
- **Language:** java
- **File:** [`153. Find Minimum in Rotated Sorted Array.java`](153.%20Find%20Minimum%20in%20Rotated%20Sorted%20Array.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 44 MB

## Notes

• If nums[low] <= nums[high],
  the current search space is already sorted.
  The minimum is nums[low].

• One half is always sorted.

• If left half is sorted:
    Save nums[low].
    Search RIGHT.

• If right half is sorted:
    Save nums[mid].
    Search LEFT.

• Keep track of the minimum using:
    ans = Math.min(ans, ...)

• This problem assumes all elements are UNIQUE.
  With duplicates, the logic changes (LeetCode 154).

_Last updated: 2026-07-18_
