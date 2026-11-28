// 1143. Longest Common Subsequence [Medium]
// https://leetcode.com/problems/longest-common-subsequence/
// Language: java | Runtime: 25 ms | Memory: 56.4 MB
// Time:  O(m·n) (auto-detected)
// Pattern: Dynamic programming
// Tags: String, Dynamic Programming, Longest Common Subsequence
// Synced: 2026-11-28

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];

                } else {

                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }

        return dp[n][m];
    }
}
