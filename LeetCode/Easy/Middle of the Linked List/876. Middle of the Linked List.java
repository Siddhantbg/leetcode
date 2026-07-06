// 876. Middle of the Linked List [Easy]
// https://leetcode.com/problems/middle-of-the-linked-list/
// Language: java | Runtime: 0 ms | Memory: 43.1 MB
// Time:  O(n)
// Space: O(1)
// Tags: Linked List, Two Pointers
// Synced: 2026-07-07
//
// Rule to remember:
// 
// Odd-length list: Returns the single middle node and everything after it.
// Even-length list: Returns the second middle node and everything after it.

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