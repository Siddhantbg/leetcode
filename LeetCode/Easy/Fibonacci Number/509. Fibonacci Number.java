// 509. Fibonacci Number [Easy]
// https://leetcode.com/problems/fibonacci-number/
// Language: java | Runtime: 0 ms | Memory: 41.6 MB
// Pattern: Memoization
// Tags: Math, Dynamic Programming, Recursion, Memoization
// Synced: 2026-11-24

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    private int solve(int n,int[]dp){
        if(n<=1){
            return n;
        }

        if(dp[n]!=-1) return dp[n];
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    }
}