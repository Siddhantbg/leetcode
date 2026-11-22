// 518. Coin Change II [Medium]
// https://leetcode.com/problems/coin-change-ii/
// Language: java | Runtime: 33 ms | Memory: 57 MB
// Pattern: Memoization
// Tags: Array, Dynamic Programming, Knapsack Problem, Complete Knapsack
// Synced: 2026-11-22

class Solution {
    int n;
    int [][]dp;
    int solve(int i,int[]coins,int amount){
        if(amount==0) return 1;
        if(i==n)return 0;

        if(dp[i][amount]!=-1) return dp[i][amount];

          if (coins[i] > amount) {            // coin bada hai, le hi nahi sakte
            return dp[i][amount] = solve(i + 1, coins, amount);
        }

        int take=solve(i,coins,amount-coins[i]);
        int skip=solve(i+1,coins,amount);

        return dp[i][amount]=take+skip;
    }
    public int change(int amount, int[] coins) {
        n=coins.length;
        dp=new int[n][amount+1];

        for(int []row:dp){
            Arrays.fill(row,-1);
        }
         
         return solve(0,coins,amount);
    }
}