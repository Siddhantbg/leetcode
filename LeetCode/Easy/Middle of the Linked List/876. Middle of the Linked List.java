// 876. Middle of the Linked List [Easy]
// https://leetcode.com/problems/middle-of-the-linked-list/
// Language: java | Runtime: 0 ms | Memory: 43.1 MB
// Time:  O(n)
// Space: O(1)
// Tags: Linked List, Two Pointers
// Synced: 2026-07-07
//
// ### Q1: Why is the output `[3,4,5]` instead of just `3`?
// 
// The function returns a `ListNode` (or `ListNode*`), which is a reference/pointer to the middle node, not just its value. The middle node has value `3`, but it is still connected to the remaining nodes `4` and `5`. Therefore, when the returned node is displayed, the entire linked list starting from that node is shown as `[3,4,5]` instead of only `3`.
// 
// ### Q2: Why does the slow and fast pointer approach return the second middle node for an even-length linked list?
// 
// In the slow and fast pointer approach, the slow pointer moves one node at a time while the fast pointer moves two nodes at a time. For an even-length list, the loop stops only when the fast pointer reaches the end of the list (`NULL`). By that time, the slow pointer has advanced to the second of the two middle nodes.
// 
// **Example:**
// 
// ```text
// Input:
// 1 → 2 → 3 → 4 → 5 → 6
// 
// Slow   Fast
// 1       1
// 2       3
// 3       5
// 4      NULL
// ```
// 
// The slow pointer stops at **4**, so the function returns the linked list starting from node `4`, which is exactly the second middle node required by the problem.
// 
// ### Rule to Remember
// 
// * **Odd-length list:** Returns the **single middle node** and everything after it.
// 
//   * Example: `1 → 2 → 3 → 4 → 5` → Returns `3 → 4 → 5` (displayed as `[3,4,5]`).
// 
// * **Even-length list:** Returns the **second middle node** and everything after it.
// 
//   * Example: `1 → 7 → 4 → 1 → 2 → 6` → Returns `1 → 2 → 6` (displayed as `[1,2,6]`).

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}