// 300. Longest Increasing Subsequence [Medium]
// https://leetcode.com/problems/longest-increasing-subsequence/
// Language: java | Runtime: 482 ms | Memory: 236.8 MB
// Pattern: Memoization
// Tags: Array, Binary Search, Dynamic Programming, Longest Increasing Subsequence
// Synced: 2026-11-28

class Solution {
    //p=prev index;
    private int solve(int nums[],int i,int p,int dp[][]){
        int n=nums.length;

        if(i>=n){
            return 0;
        }

        int take=0;
        int skip=0;
        if(dp[i][p+1]!=-1){
            return dp[i][p+1];
        }

        if(p==-1 ||nums[p]<nums[i]){
           take=1+solve(nums,i+1,i,dp);
          //recursion me 2 vars change ho rhe so dp[][]. 2 dimension
        }
            skip=solve(nums,i+1,p,dp);
            if(p!=-1){
            dp[i][p+1]=Math.max(take,skip);
            }

        return Math.max(take,skip);
    }

    public int lengthOfLIS(int[] nums) {
                int n=nums.length;
                int dp[][]=new int[n+1][n+1];
    
            for(int []row:dp){
                    Arrays.fill(row,-1);
                }           
     return solve(nums,0,-1,dp);
    }
}