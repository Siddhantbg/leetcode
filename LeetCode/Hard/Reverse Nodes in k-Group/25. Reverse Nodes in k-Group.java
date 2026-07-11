// 25. Reverse Nodes in k-Group [Hard]
// https://leetcode.com/problems/reverse-nodes-in-k-group/
// Language: java | Runtime: 1 ms | Memory: 46.4 MB
// Time:  O(n)
// Space: O(1)
// Tags: Linked List, Recursion
// Synced: 2026-07-12
//
// Example
// 
// 1 -> 2 -> 3 -> 4 -> 5
// k = 2
// 
// ------------------------------------------------------------
// START
// ------------------------------------------------------------
// 
// dummy -> 1 -> 2 -> 3 -> 4 -> 5
// 
// groupPrev = dummy
// 
// 
// ============================================================
// WHILE LOOP 1
// ============================================================
// 
// ------------------------
// Find kth
// ------------------------
// 
// ListNode kth = groupPrev;
// 
// kth = dummy
// 
// for(int i=0;i<k && kth!=null;i++){
//     kth = kth.next;
// }
// 
// i = 0
// kth = 1
// 
// i = 1
// kth = 2
// 
// Final
// 
// kth = 2
// 
// 
// ------------------------
// Save next group
// ------------------------
// 
// ListNode groupNext = kth.next;
// 
// groupNext = 3
// 
// 
// ------------------------
// Setup reversal
// ------------------------
// 
// ListNode prev = groupNext;
// ListNode curr = groupPrev.next;
// 
// prev = 3
// curr = 1
// 
// 
// Current picture
// 
// dummy -> 1 -> 2 -> 3 -> 4 -> 5
//          ^
//        curr
// 
// prev -> 3
// 
// 
// ------------------------
// Reverse while
// ------------------------
// 
// while(curr != groupNext)
// 
// ------------------------
// Iteration 1
// ------------------------
// 
// ListNode next = curr.next;
// 
// next = 2
// 
// curr.next = prev;
// 
// 1 -> 3
// 
// Current links
// 
// 1 -> 3 -> 4 -> 5
// 
// 2 -> 3
// 
// prev = curr;
// 
// prev = 1
// 
// curr = next;
// 
// curr = 2
// 
// 
// ------------------------
// Iteration 2
// ------------------------
// 
// next = curr.next;
// 
// next = 3
// 
// curr.next = prev;
// 
// 2 -> 1 -> 3
// 
// prev = curr;
// 
// prev = 2
// 
// curr = next;
// 
// curr = 3
// 
// curr == groupNext
// 
// Stop
// 
// 
// Current reversed piece
// 
// 2 -> 1 -> 3 -> 4 -> 5
// 
// 
// ------------------------
// Reconnect
// ------------------------
// 
// ListNode temp = groupPrev.next;
// 
// temp = 1
// 
// groupPrev.next = kth;
// 
// dummy -> 2 -> 1 -> 3 -> 4 -> 5
// 
// groupPrev = temp;
// 
// groupPrev = 1
// 
// 
// State after loop 1
// 
// dummy -> 2 -> 1 -> 3 -> 4 -> 5
//                   ^
//                groupPrev
// 
// 
// ============================================================
// WHILE LOOP 2
// ============================================================
// 
// ------------------------
// Find kth
// ------------------------
// 
// kth = groupPrev
// 
// i = 0
// 
// kth = 3
// 
// i = 1
// 
// kth = 4
// 
// Final
// 
// kth = 4
// 
// 
// ------------------------
// Save next group
// ------------------------
// 
// groupNext = 5
// 
// 
// ------------------------
// Setup reversal
// ------------------------
// 
// prev = 5
// 
// curr = 3
// 
// 
// ------------------------
// Reverse while
// ------------------------
// 
// Iteration 1
// 
// next = 4
// 
// 3 -> 5
// 
// prev = 3
// 
// curr = 4
// 
// 
// Iteration 2
// 
// next = 5
// 
// 4 -> 3
// 
// prev = 4
// 
// curr = 5
// 
// curr == groupNext
// 
// Stop
// 
// 
// Current reversed piece
// 
// 4 -> 3 -> 5
// 
// 
// ------------------------
// Reconnect
// ------------------------
// 
// temp = groupPrev.next;
// 
// temp = 3
// 
// groupPrev.next = kth;
// 
// 2 -> 1 -> 4 -> 3 -> 5
// 
// groupPrev = temp;
// 
// groupPrev = 3
// 
// 
// State after loop 2
// 
// dummy -> 2 -> 1 -> 4 -> 3 -> 5
//                         ^
//                     groupPrev
// 
// 
// ============================================================
// WHILE LOOP 3
// ============================================================
// 
// Find kth
// 
// kth = groupPrev
// 
// i = 0
// 
// kth = 5
// 
// i = 1
// 
// kth = null
// 
// Less than k nodes left
// 
// break
// 
// 
// ============================================================
// RETURN
// ============================================================
// 
// return dummy.next;
// 
// 
// Final Answer
// 
// 2 -> 1 -> 4 -> 3 -> 5
// 
// 
// ============================================================
// THE FIVE POINTERS
// ============================================================
// 
// groupPrev
// |
// v
// Node before the current group.
// 
// 
// kth
// |
// v
// Last node of the current k-group.
// 
// 
// groupNext
// |
// v
// First node after the current group.
// 
// 
// prev
// |
// v
// Starts from groupNext.
// During reversal it keeps becoming the head of the reversed part.
// 
// 
// curr
// |
// v
// Moves through the group and reverses one link at a time.
// 
// 
// ============================================================
// MENTAL PICTURE
// ============================================================
// 
// Before
// 
// groupPrev
//     |
//     v
// 
// ... -> 1 -> 2 -> 3 -> 4 -> 5
//        ^              ^
//       curr           kth
//                       |
//                 groupNext = 5
// 
// 
// Reverse only until curr reaches groupNext
// 
// 
// After
// 
// groupPrev
//     |
//     v
// 
// ... -> 4 -> 3 -> 2 -> 1 -> 5
// 
// 
// ============================================================
// WHOLE ALGORITHM
// ============================================================
// 
// Find kth
// ↓
// 
// Remember groupNext
// ↓
// 
// Reverse k nodes
// ↓
// 
// Reconnect
// 
// groupPrev.next = kth
// 
// ↓
// 
// Move groupPrev to old first node
// 
// ↓
// 
// Repeat
// 
// ↓
// 
// Return dummy.next

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