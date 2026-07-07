# 234. Palindrome Linked List

- **Difficulty:** Easy
- **Link:** [palindrome-linked-list](https://leetcode.com/problems/palindrome-linked-list/)
- **Language(s):** java
- **Time complexity:** O(n)
- **Space complexity:** O(1)
- **Runtime:** 3 ms
- **Memory:** 94.4 MB

## Notes

⭐ Why Compare Only Until p2 == null?

Example

1→2→3→2→1

Second half after reversing

1→2→3

or for even cases, it is exactly half the list.

We only need to compare the reversed half. Once p2 finishes, every required comparison is complete.

_Last updated: 2026-07-07_
