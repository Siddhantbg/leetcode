// 53. Maximum Subarray [Medium]
// https://leetcode.com/problems/maximum-subarray/
// Language: java | Runtime: 1 ms | Memory: 77.1 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Divide and Conquer, Dynamic Programming
// Synced: 2026-11-05

class Solution {
    public int maxSubArray(int[] nums) {
     int sum=0;
int maxSum=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        maxSum=Math.max(maxSum,sum);
        if(sum<0) sum=0;
     }   
     return maxSum;
    }
}