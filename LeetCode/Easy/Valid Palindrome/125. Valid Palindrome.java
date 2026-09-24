// 125. Valid Palindrome [Easy]
// https://leetcode.com/problems/valid-palindrome/
// Language: java | Runtime: 2 ms | Memory: 44.4 MB
// Tags: Two Pointers, String
// Synced: 2026-09-24

class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            char la=Character.toLowerCase(s.charAt(l));
            char ra=Character.toLowerCase(s.charAt(r));

            if(la!=ra){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}