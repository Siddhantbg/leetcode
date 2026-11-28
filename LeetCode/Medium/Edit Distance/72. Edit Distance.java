// 72. Edit Distance [Medium]
// https://leetcode.com/problems/edit-distance/
// Language: java | Runtime: 4 ms | Memory: 46.7 MB
// Pattern: Memoization
// Tags: String, Dynamic Programming
// Synced: 2026-11-29

class Solution {
    int dp[][];
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        dp = new int[m + 1][n + 1];
       for (int row[] : dp) {
    Arrays.fill(row, -1);
}
        return solve(word1,word2,0,0);
        
    }

    int solve(String s1, String s2, int i,int j){
          int m=s1.length();
          int n=s2.length();

        if(i==m){
            return n-j;
        }

        else if(j==n){
            return m-i;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=solve(s1,s2,i+1,j+1);
        }

        int insert=1+solve(s1,s2,i,j+1);
        int delete=1+solve(s1,s2,i+1,j);
        int replace=1+solve(s1,s2,i+1,j+1);

    return dp[i][j]= Math.min(insert, Math.min(delete, replace));

    }
}