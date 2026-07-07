// 19. Remove Nth Node From End of List [Medium]
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Language: java | Runtime: 0 ms | Memory: 43.3 MB
// Tags: Linked List, Two Pointers
// Synced: 2026-07-08

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}