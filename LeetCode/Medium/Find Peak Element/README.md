# 162. Find Peak Element

- **Difficulty:** Medium
- **Link:** [find-peak-element](https://leetcode.com/problems/find-peak-element/)
- **Language:** java
- **File:** [`162. Find Peak Element.java`](162.%20Find%20Peak%20Element.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 44.2 MB

## Notes

• Binary Search on the slope.

• Compare only:
    nums[mid] and nums[mid + 1].

• If nums[mid] < nums[mid + 1]:
    You're on an increasing slope.
    Search RIGHT.

• If nums[mid] > nums[mid + 1]:
    You're on a decreasing slope.
    Search LEFT (including mid).

• Use:
    while (low < high)

• When low == high,
    that index is guaranteed to be a peak.

• Don't use:
    high = mid - 1
  because mid itself may be the peak.

• There can be multiple peaks.
  Returning any one is valid.

_Last updated: 2026-08-07_
