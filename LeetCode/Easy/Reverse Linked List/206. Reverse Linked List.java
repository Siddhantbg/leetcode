// 206. Reverse Linked List [Easy]
// https://leetcode.com/problems/reverse-linked-list/
// Language: java | Runtime: 0 ms | Memory: 44 MB
// Tags: Linked List, Recursion
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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
        ListNode next=curr.next;
           curr.next=prev;//null
           prev=curr;//1
           curr=next;//2

        }
        return prev;
    }
}