// 19. Remove Nth Node From End of List [Medium]
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Language: java | Runtime: 0 ms | Memory: 43.5 MB
// Tags: Linked List, Two Pointers
// Synced: 2026-07-06

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode fast=dummy;
        ListNode slow=dummy;
//move fast by n+1 
//Because linked lists don't support random access.isiliye assign nhi kr skte
//fast = dummy[n + 1];   // ❌ Doesn't exist
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return dummy.next;

    }
}