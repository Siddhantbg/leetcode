// 680. Valid Palindrome II [Easy]
// https://leetcode.com/problems/valid-palindrome-ii/
// Language: java | Runtime: 4 ms | Memory: 48 MB
// Time:  o(n)
// Space: O(1)
// Tags: Two Pointers, String, Greedy
// Synced: 2026-06-30

class Solution {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){

                return isPalindrome(s, left + 1, right) ||
                       isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right){

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}