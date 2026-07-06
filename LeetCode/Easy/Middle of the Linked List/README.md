# 876. Middle of the Linked List

- **Difficulty:** Easy
- **Link:** [middle-of-the-linked-list](https://leetcode.com/problems/middle-of-the-linked-list/)
- **Language(s):** java
- **Time complexity:** O(n)
- **Space complexity:** O(1)
- **Runtime:** 0 ms
- **Memory:** 43.1 MB

## Notes

### Q1: Why is the output `[3,4,5]` instead of just `3`?

The function returns a `ListNode` (or `ListNode*`), which is a reference/pointer to the middle node, not just its value. The middle node has value `3`, but it is still connected to the remaining nodes `4` and `5`. Therefore, when the returned node is displayed, the entire linked list starting from that node is shown as `[3,4,5]` instead of only `3`.

### Q2: Why does the slow and fast pointer approach return the second middle node for an even-length linked list?

In the slow and fast pointer approach, the slow pointer moves one node at a time while the fast pointer moves two nodes at a time. For an even-length list, the loop stops only when the fast pointer reaches the end of the list (`NULL`). By that time, the slow pointer has advanced to the second of the two middle nodes.

**Example:**

```
Input:
1 → 2 → 3 → 4 → 5 → 6

Slow   Fast
1       1
2       3
3       5
4      NULL
```

The slow pointer stops at **4**, so the function returns the linked list starting from node `4`, which is exactly the second middle node required by the problem.

_Last updated: 2026-07-07_
