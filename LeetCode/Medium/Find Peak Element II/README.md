# 1901. Find Peak Element II

- **Difficulty:** Medium
- **Link:** [find-peak-element-ii](https://leetcode.com/problems/find-peak-element-ii/)
- **Language:** java
- **File:** [`1901. Find Peak Element II.java`](1901.%20Find%20Peak%20Element%20II.java)
- **Time complexity:** O(rows x log(cols))
- **Space complexity:** O(1)

## Notes

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
    O(rows x log(cols))

• Space:
    O(1)

• Pattern:
    Binary Search + Find Maximum in Column

_Last updated: 2026-09-08_
