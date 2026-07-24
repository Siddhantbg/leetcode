# 1283. Find the Smallest Divisor Given a Threshold

- **Difficulty:** Medium
- **Link:** [find-the-smallest-divisor-given-a-threshold](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)
- **Language:** java
- **File:** [`1283. Find the Smallest Divisor Given a Threshold.java`](1283.%20Find%20the%20Smallest%20Divisor%20Given%20a%20Threshold.java)
- **Time complexity:** O(n*log(max(nums)))
- **Space complexity:** O(1)
- **Runtime:** 6 ms
- **Memory:** 50.9 MB

## Notes

• This is a Binary Search on Answer problem.

• Search space = [1, max(nums)].

• Compute:
    sum = Σ ceil(nums[i] / divisor)

• If sum <= threshold:
    Current divisor works.
    Search LEFT for a smaller valid divisor.

• If sum > threshold:
    Divisor is too small.
    Search RIGHT.

• Return low after Binary Search ends.

• Avoid Math.ceil().
  Use integer formula:
    (num + divisor - 1) / divisor

• The monotonic property is:
    Larger divisor -> Smaller (or equal) sum.

_Last updated: 2026-07-25_
