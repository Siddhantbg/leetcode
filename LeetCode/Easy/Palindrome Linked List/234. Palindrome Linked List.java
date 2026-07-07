// 234. Palindrome Linked List [Easy]
// https://leetcode.com/problems/palindrome-linked-list/
// Language: java | Runtime: 4 ms | Memory: 94.5 MB
// Tags: Linked List, Two Pointers, Stack, Recursion
// Synced: 2026-07-07

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
//find middle element
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
//reverse linked list
// For every node, perform these 4 steps:

// Save the next node (next = curr.next)
// Reverse the link (curr.next = prev)
// Move prev forward (prev = curr)
// Move curr forward (curr = next)

// Mnemonic: Save → Reverse → Move Prev → Move Curr.
        while(curr != null){

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }
//split into 2 patts
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