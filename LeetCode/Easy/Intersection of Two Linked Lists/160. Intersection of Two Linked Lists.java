// 160. Intersection of Two Linked Lists [Easy]
// https://leetcode.com/problems/intersection-of-two-linked-lists/
// Language: java | Runtime: 1 ms | Memory: 52.8 MB
// Time:  O(m+n)
// Space: O(1)
// Tags: Hash Table, Linked List, Two Pointers
// Synced: 2026-07-11

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;

        while(pA!=pB){
            if(pA==null){
                pA=headB;
            }else{
                pA=pA.next;
            }

            if(pB==null){
                pB=headA;
            }else{
                pB=pB.next;
            }
        }
        return pA;
    }
}