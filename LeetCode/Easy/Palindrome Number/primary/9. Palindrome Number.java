// 9. Palindrome Number [Easy]
// https://leetcode.com/problems/palindrome-number/
// Language: java | Runtime: 6 ms | Memory: 46 MB
// Time:  O(n)
// Space: O(1)
// Tags: Math
// Synced: 2026-08-20

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}