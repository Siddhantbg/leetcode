# 540. Single Element in a Sorted Array

- **Difficulty:** Medium
- **Link:** [single-element-in-a-sorted-array](https://leetcode.com/problems/single-element-in-a-sorted-array/)
- **Language:** java
- **File:** [`540. Single Element in a Sorted Array.java`](540.%20Single%20Element%20in%20a%20Sorted%20Array.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 52.9 MB

## Notes

• Before the single element:
    Every pair starts at an EVEN index.

• After the single element:
    Every pair starts at an ODD index.

• First check edge cases:
    - Single element array
    - First element is unique
    - Last element is unique

• If nums[mid] is different from both neighbors,
  it is the answer.

• If the pairing pattern is correct,
  search RIGHT.

• If the pairing pattern is broken,
  search LEFT.

• The key is observing the index pattern,
  not the element values.

_Last updated: 2026-07-21_
