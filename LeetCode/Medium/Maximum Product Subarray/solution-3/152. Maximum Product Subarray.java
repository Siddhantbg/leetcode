// 152. Maximum Product Subarray [Medium]
// https://leetcode.com/problems/maximum-product-subarray/
// Language: java | Runtime: 2 ms | Memory: 46.6 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-11-05

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        double pro=Double.NEGATIVE_INFINITY;
        double pre=1,suf=1;

        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;

            pre*=nums[i];
            suf*=nums[n-1-i];
            pro=Math.max(pro,Math.max(pre,suf));
        }
return (int) pro;
    }
}