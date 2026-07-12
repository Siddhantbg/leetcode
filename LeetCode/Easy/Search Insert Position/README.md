# 35. Search Insert Position

- **Difficulty:** Easy
- **Link:** [search-insert-position](https://leetcode.com/problems/search-insert-position/)
- **Language:** java
- **File:** [`35. Search Insert Position.java`](35.%20Search%20Insert%20Position.java)
- **Time complexity:** O(log n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 44.8 MB

## Notes

• Search Insert Position is exactly the Lower Bound problem.

• Answer = First index where nums[i] >= target.

• If the target exists:
    Return its index.

• If the target doesn't exist:
    Return the index where it should be inserted.

• Elegant implementation:
    Don't store ans.
    Return low after the loop.

• At loop termination:
    All elements before low are < target.
    All elements from low onward are >= target.
    Hence, low is the insertion position.

_Last updated: 2026-07-13_
