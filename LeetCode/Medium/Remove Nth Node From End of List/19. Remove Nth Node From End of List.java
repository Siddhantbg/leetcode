// 19. Remove Nth Node From End of List [Medium]
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Language: java | Runtime: 0 ms | Memory: 43.3 MB
// Time:  O(n)
// Space: O(1)
// Tags: Linked List, Two Pointers
// Synced: 2026-07-08
//
// ```text
// Q1. Why do we use a dummy node in a linked list?
// 
// A:
// A dummy node is an extra node placed before the head of the linked list.
// It simplifies edge cases, especially when the head node needs to be removed.
// Instead of handling the head as a special case, every deletion is performed the same way by modifying the previous node's next pointer.
// 
// 
// Q2. How does `dummy.next = head` work?
// 
// A:
// `dummy.next = head` does not copy the linked list.
// It simply makes `dummy.next` point to the same first node that `head` points to.
// Both `head` and `dummy.next` reference the same node in memory.
// 
// 
// Q3. Does `dummy` contain the values of the linked list?
// 
// A:
// No.
// The dummy node only contains its own value (usually 0) and a reference (`next`) to the head of the linked list.
// No nodes or values are copied.
// 
// 
// Q4. What does `dummy.next` return?
// 
// A:
// `dummy.next` returns a reference to the first node (the head) of the linked list.
// It does not return the entire list directly.
// 
// 
// Q5. When you say "node", do you mean the entire linked list?
// 
// A:
// No.
// A node is a single object containing:
// - a value (`val`)
// - a reference to the next node (`next`)
// 
// However, since each node points to the next node, starting from one node allows you to traverse the remainder of the linked list.
// 
// 
// Q6. Why does `return dummy.next` return the whole linked list?
// 
// A:
// A linked list is represented by a reference to its first node.
// When `dummy.next` (the head) is returned, the caller receives the first node.
// Since each node stores a reference to the next node, the caller can access every node in the chain.
// Only the first node needs to be returned.
// 
// 
// Q7. What does `slow.next = slow.next.next` do?
// 
// A:
// It removes the node immediately after `slow`.
// 
// Before:
// slow -> A -> B
// 
// After:
// slow -> B
// 
// The node A is skipped and becomes disconnected from the linked list.
// 
// 
// Q8. Why not write `slow = slow.next.next` instead?
// 
// A:
// `slow = slow.next.next` only moves the local variable `slow`.
// It does not change the structure of the linked list.
// 
// `slow.next = slow.next.next` updates the links between nodes, which actually removes a node from the list.
// 
// 
// Q9. Why don't we explicitly write `dummy.next = dummy.next.next` in the code?
// 
// A:
// Because `slow` may point to the dummy node.
// When `slow == dummy`, the statement
// 
//     slow.next = slow.next.next;
// 
// is effectively the same as
// 
//     dummy.next = dummy.next.next;
// 
// This happens when the head node needs to be removed.
// 
// 
// Q10. Why does the deleted node disappear after `slow.next = slow.next.next`?
// 
// A:
// The previous node's `next` pointer is changed to skip the node being deleted.
// Since no node points to the deleted node anymore, it becomes unreachable from the head and is effectively removed from the linked list.
// ```

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}