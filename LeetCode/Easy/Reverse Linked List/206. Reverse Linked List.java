// 206. Reverse Linked List [Easy]
// https://leetcode.com/problems/reverse-linked-list/
// Language: java | Runtime: 0 ms | Memory: 44.4 MB
// Tags: Linked List, Recursion
// Synced: 2026-07-07
//
// ### Reverse a Linked List (Node by Node)
// 
// **Example:**
// 
// ```text
// 3 → 2 → 1 → NULL
// 
// prev = NULL
// curr = 3
// ```
// 
// #### **Iteration 1**
// 
// ```java
// ListNode next = curr.next;
// ```
// 
// ```
// next → 2
// curr → 3
// ```
// 
// ```java
// curr.next = prev;
// ```
// 
// ```
// 3 → NULL
// 2 → 1
// ```
// 
// ```java
// prev = curr;
// ```
// 
// ```
// prev → 3 → NULL
// ```
// 
// ```java
// curr = next;
// ```
// 
// ```
// curr → 2 → 1
// ```
// 
// ---
// 
// #### **Iteration 2**
// 
// Current:
// 
// ```
// prev → 3 → NULL
// curr → 2 → 1
// ```
// 
// ```java
// next = curr.next;
// ```
// 
// ```
// next → 1 
// ```
// 
// ```java
// curr.next = prev;
// ```
// 
// ```
// 2 → 3 → NULL
// ```
// 
// ```java
// prev = curr;
// ```
// 
// ```
// prev → 2 → 3 → NULL
// ```
// 
// ```java
// curr = next;
// ```
// 
// ```
// curr → 1
// ```
// 
// ---
// 
// #### **Iteration 3**
// 
// Current:
// 
// ```
// prev → 2 → 3 → NULL
// curr → 1
// ```
// 
// ```java
// next = curr.next;
// ```
// 
// ```
// next → NULL
// ```
// 
// ```java
// curr.next = prev;
// ```
// 
// ```
// 1 → 2 → 3 → NULL
// ```
// 
// ```java
// prev = curr;
// ```
// 
// ```
// prev → 1 → 2 → 3 → NULL
// ```
// 
// ```java
// curr = next;
// ```
// 
// ```
// curr → NULL
// ```
// 
// Loop ends.
// 
// ### Final Result
// 
// ```
// prev → 1 → 2 → 3 → NULL
// ```
// 
// ### Trick to Remember
// 
// For every node, perform these **4 steps**:
// 
// 1. **Save** the next node (`next = curr.next`)
// 2. **Reverse** the link (`curr.next = prev`)
// 3. **Move** `prev` forward (`prev = curr`)
// 4. **Move** `curr` forward (`curr = next`)
// 
// **Mnemonic:** **Save → Reverse → Move Prev → Move Curr**.

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