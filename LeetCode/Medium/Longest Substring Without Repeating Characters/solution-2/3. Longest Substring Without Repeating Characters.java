// 3. Longest Substring Without Repeating Characters [Medium]
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Language: java | Runtime: 63 ms | Memory: 47.3 MB
// Space: O(n) (auto-detected)
// Pattern: Sliding window + Hash set
// Tags: Hash Table, String, Sliding Window
// Synced: 2026-11-22

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int mL=0;

        HashSet<Character> p=new HashSet<>();
        for(int r=0;r<s.length();r++){
            char cur=s.charAt(r);
            while(p.contains(cur)){
                p.remove(s.charAt(l));
                l++;
            }
            p.add(cur);
             mL=Math.max(mL,r-l+1);

        }

        return mL;
    }
}