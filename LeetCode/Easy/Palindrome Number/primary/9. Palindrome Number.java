// 9. Palindrome Number [Easy]
// https://leetcode.com/problems/palindrome-number/
// Language: java | Runtime: 4 ms | Memory: 46.1 MB
// Time:  O(n)
// Space: O(1)
// Tags: Math
// Synced: 2026-08-20

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int original = x;
        int reverse = 0;

        while (x != 0) {
            reverse = reverse * 10;
            reverse+= x % 10;
            x /= 10;
        }

        return original == reverse;
    }
}