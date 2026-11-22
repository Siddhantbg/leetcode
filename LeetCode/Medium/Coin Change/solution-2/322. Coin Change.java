// 322. Coin Change [Medium]
// https://leetcode.com/problems/coin-change/
// Language: java | Runtime: 17 ms | Memory: 45.7 MB
// Time:  O(m·n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Dynamic programming
// Tags: Array, Dynamic Programming, Breadth-First Search, Knapsack Problem, Complete Knapsack
// Synced: 2026-11-22

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];

        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(c<=i){
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
                }
            }
        }

        if(dp[amount]>amount){
            return -1;
        }
        return dp[amount];
    }
}