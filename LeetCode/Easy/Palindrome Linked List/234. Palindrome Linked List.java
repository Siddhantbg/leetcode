// 234. Palindrome Linked List [Easy]
// https://leetcode.com/problems/palindrome-linked-list/
// Language: java | Runtime: 4 ms | Memory: 94.4 MB
// Time:  O(n)
// Space: O(1)
// Tags: Linked List, Two Pointers, Stack, Recursion
// Synced: 2026-07-07
//
// ⭐ Why Compare Only Until p2 == null?
// 
// Example
// 
// 1→2→3→2→1
// 
// Second half after reversing
// 
// 1→2→3
// 
// or for even cases, it is exactly half the list.
// 
// We only need to compare the reversed half. Once p2 finishes, every required comparison is complete.

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

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p2 != null){

            if(p1.val != p2.val){
                return false;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}