// 25. Reverse Nodes in k-Group [Hard]
// https://leetcode.com/problems/reverse-nodes-in-k-group/
// Language: java | Runtime: 1 ms | Memory: 46.4 MB
// Tags: Linked List, Recursion
// Synced: 2026-07-12

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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev=dummy;

        while(true){
                        // Find the kth node

            ListNode kth=groupPrev;

            for(int i=0;i<k && kth!=null;i++){
                kth=kth.next;
            }
            // Less than k nodes left

            if(kth==null){
                break;
            }
                        // Reverse current group

            ListNode groupNext=kth.next;

            ListNode prev=groupNext;
            ListNode curr=groupPrev.next;

            while(curr!=groupNext){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode temp=groupPrev.next;

            groupPrev.next=kth;

            groupPrev=temp;
        }
        return dummy.next;
    }
}