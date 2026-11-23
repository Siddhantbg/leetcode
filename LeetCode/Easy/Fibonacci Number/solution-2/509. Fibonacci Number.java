// 509. Fibonacci Number [Easy]
// https://leetcode.com/problems/fibonacci-number/
// Language: java | Runtime: 0 ms | Memory: 41.5 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Dynamic programming
// Tags: Math, Dynamic Programming, Recursion, Memoization
// Synced: 2026-11-24

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }

        int dp[]=new int[n+1];

        Arrays.fill(dp,-1);

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
        
    }
}