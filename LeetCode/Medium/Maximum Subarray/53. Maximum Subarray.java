// 53. Maximum Subarray [Medium]
// https://leetcode.com/problems/maximum-subarray/
// Language: java | Runtime: 1 ms | Memory: 76.6 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Synced: 2026-10-21

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;

        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(maxSum<sum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}