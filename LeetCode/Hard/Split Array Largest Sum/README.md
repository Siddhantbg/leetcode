# 410. Split Array Largest Sum

- **Difficulty:** Hard
- **Link:** [split-array-largest-sum](https://leetcode.com/problems/split-array-largest-sum/)
- **Language:** java
- **File:** [`410. Split Array Largest Sum.java`](410.%20Split%20Array%20Largest%20Sum.java)
- **Time complexity:** O(n*log(sum))
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 43.3 MB

## Notes

• Binary Search on Answer.

• Search space:
    [max(nums), sum(nums)]

• Each subarray must be CONTIGUOUS.

• Greedily keep adding elements to the current subarray until
  adding the next element exceeds the current limit.
  Then start a new subarray.

• If required subarrays <= k:
    Current maximum sum works.
    Search LEFT for a smaller maximum.

• If required subarrays > k:
    Current maximum sum is too small.
    Search RIGHT.

• Return low after Binary Search ends.

• The minimum possible answer is:
    max(nums)
  because one subarray must contain the largest element.

• The maximum possible answer is:
    sum(nums)
  when the entire array forms one subarray.

• Same pattern as:
    - Book Allocation Problem
    - Painter's Partition
    - Capacity to Ship Packages Within D Days (LC 1011)

_Last updated: 2026-08-05_
