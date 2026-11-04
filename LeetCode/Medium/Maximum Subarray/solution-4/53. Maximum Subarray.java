// 53. Maximum Subarray [Medium]
// https://leetcode.com/problems/maximum-subarray/
// Language: java | Runtime: 1 ms | Memory: 80.1 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Divide and Conquer, Dynamic Programming
// Synced: 2026-11-04

class Solution {
    public int maxSubArray(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            maxSum=Math.max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}