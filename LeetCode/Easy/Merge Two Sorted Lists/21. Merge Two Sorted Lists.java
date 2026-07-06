// 21. Merge Two Sorted Lists [Easy]
// https://leetcode.com/problems/merge-two-sorted-lists/
// Language: java | Runtime: 0 ms | Memory: 44.3 MB
// Time:  O(n+m)
// Space: O(1)
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }else{
                tail.next=list2;
                list2=list2.next;
            }
         tail=tail.next;
        }
        if(list1!=null){
            tail.next=list1;
        }if(list2!=null){
            tail.next=list2;
        }
        return dummy.next;
    }
}