# 141. Linked List Cycle

- **Difficulty:** Easy
- **Link:** [linked-list-cycle](https://leetcode.com/problems/linked-list-cycle/)
- **Language(s):** java
- **Time complexity:** O(n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 47 MB

## Notes

⭐ Why Compare Nodes?

We do

slow == fast

NOT

slow.val == fast.val

Because values can repeat. Cycle detection is about same node not same value.

Why 2 ptrs?
Since fast catches the slower one

_Last updated: 2026-07-07_
