// 2. Add Two Numbers [Medium]
// https://leetcode.com/problems/add-two-numbers/
// Language: java | Runtime: 1 ms | Memory: 46.5 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Linked List, Math, Recursion
// Synced: 2026-10-11


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0);
        ListNode t = d;
        int c = 0;

        while (l1 != null || l2 != null || c != 0) {
            int s = c;

            if (l1 != null) {
                s += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                s += l2.val;
                l2 = l2.next;
            }

            c = s / 10;
            t.next = new ListNode(s % 10);
            t = t.next;
        }

        return d.next;
    }
}
