// 152. Maximum Product Subarray [Medium]
// https://leetcode.com/problems/maximum-product-subarray/
// Language: java | Runtime: 2 ms | Memory: 46.9 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-11-04

class Solution {
    public int maxProduct(int[] nums) {
        double suf=1,pre=1;
        int n=nums.length;
        double ans=Double.NEGATIVE_INFINITY;
        
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre*=nums[i];
            suf*=nums[n-1-i];
            
            ans=Math.max(ans,Math.max(pre,suf));
        }
        return (int)ans;
    }
}