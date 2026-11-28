// 300. Longest Increasing Subsequence [Medium]
// https://leetcode.com/problems/longest-increasing-subsequence/
// Language: java | Runtime: 47 ms | Memory: 45.5 MB
// Time:  O(n^2)
// Space: O(n) (auto-detected)
// Pattern: Nested loops
// Synced: 2026-11-28

class Solution {
    public int lengthOfLIS(int[] nums) {
    int n=nums.length;

    int mLis=1;
    int t[]=new int[n];
    Arrays.fill(t, 1);
    
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                t[i]=Math.max(t[i],t[j]+1);
                mLis=Math.max(mLis,t[i]);
            }
        }
    }  
    
    return mLis;
    }
}