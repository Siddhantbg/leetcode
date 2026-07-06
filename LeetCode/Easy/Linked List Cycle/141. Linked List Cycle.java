// 141. Linked List Cycle [Easy]
// https://leetcode.com/problems/linked-list-cycle/
// Language: java | Runtime: 0 ms | Memory: 47 MB
// Time:  O(n)
// Space: O(1)
// Tags: Hash Table, Linked List, Two Pointers
// Synced: 2026-07-07
//
// ⭐ Why Compare Nodes?
// 
// We do
// 
// slow == fast
// 
// NOT
// 
// slow.val == fast.val
// 
// Because values can repeat. Cycle detection is about same node not same value.
// 
// Why 2 ptrs?
// Since fast catches the slower one

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}