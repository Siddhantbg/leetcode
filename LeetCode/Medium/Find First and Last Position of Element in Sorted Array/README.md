# 34. Find First and Last Position of Element in Sorted Array

- **Difficulty:** Medium
- **Link:** [find-first-and-last-position-of-element-in-sorted-array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
- **Language:** java
- **File:** [`34. Find First and Last Position of Element in Sorted Array.java`](34.%20Find%20First%20and%20Last%20Position%20of%20Element%20in%20Sorted%20Array.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 48.3 MB

## Notes

• Solve using TWO Binary Searches.

• First Occurrence:
    When target is found,
    save the index and search LEFT.

• Last Occurrence:
    When target is found,
    save the index and search RIGHT.

• Never stop immediately after finding the target.
  Continue searching to find the extreme occurrence.

• If target is absent,
    return [-1, -1].

• This pattern is commonly used when handling duplicates in a sorted array.

_Last updated: 2026-07-13_
