// 322. Coin Change [Medium]
// https://leetcode.com/problems/coin-change/
// Language: java | Runtime: 28 ms | Memory: 46.7 MB
// Time:  O(amount*k)
// Space: O(amount)
// Pattern: Memoization
// Synced: 2026-11-22

class Solution {
    int []dp;

    public int coinChange(int[] coins, int amount) {

        dp=new int[amount+1];
        Arrays.fill(dp,-1);        

        int res=solve(coins,amount);
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    int solve(int[] coins,int amount){
        if(amount==0) return 0;

        if(amount<0) return Integer.MAX_VALUE;

        if(dp[amount]!=-1) return dp[amount];
        
        int min=Integer.MAX_VALUE;

        for(int c:coins){
            int sub=solve(coins,amount-c);
            if(sub!=Integer.MAX_VALUE){
                min=Math.min(min,sub+1);
            }
        }
        return dp[amount]=min;
    }
}