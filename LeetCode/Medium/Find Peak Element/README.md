# 162. Find Peak Element

- **Difficulty:** Medium
- **Link:** [find-peak-element](https://leetcode.com/problems/find-peak-element/)
- **Language:** java
- **File:** [`162. Find Peak Element.java`](162.%20Find%20Peak%20Element.java)
- **Time complexity:** O(rows × log(cols))
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 43.9 MB

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

• 2D version of Find Peak Element.

• Binary Search on COLUMNS.

• For every middle column:
    Find its maximum element.

• Column maximum is already greater than:
    UP and DOWN.

• Compare it with:
    LEFT and RIGHT.

• If current > left AND right:
    Peak found.

• If right > current:
    Search RIGHT.

• Otherwise:
    Search LEFT.

• Time:
    O(rows × log(cols))

• Space:
    O(1)

• Pattern:
    Binary Search + Find Maximum in Column

_Last updated: 2026-09-08_
