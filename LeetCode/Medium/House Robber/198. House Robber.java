// 198. House Robber [Medium]
// https://leetcode.com/problems/house-robber/
// Language: java | Runtime: 0 ms | Memory: 42.2 MB
// Pattern: Memoization
// Tags: Array, Dynamic Programming
// Synced: 2026-11-20

class Solution {
    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);

        return solve(nums,0,nums.length,dp);
    }

    private int solve(int[]nums,int i,int n,int[]dp){
        
        if(i>=n){
            return 0;
        }
    
        if(dp[i]!=-1){
            return dp[i];
        }

        int steal=nums[i]+solve(nums,i+2,n,dp);
        int skip=solve(nums,i+1,n,dp);
        
        return dp[i]=Math.max(steal,skip);
    }
}