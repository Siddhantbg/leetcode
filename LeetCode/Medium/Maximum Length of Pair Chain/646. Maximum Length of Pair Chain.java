// 646. Maximum Length of Pair Chain [Medium]
// https://leetcode.com/problems/maximum-length-of-pair-chain/
// Language: java | Runtime: 120 ms | Memory: 66.2 MB
// Pattern: Memoization + Sorting
// Tags: Array, Dynamic Programming, Greedy, Sorting, Longest Increasing Subsequence
// Synced: 2026-11-28


class Solution {

    private int solve(int[][] pairs, int i, int p, int dp[][]) {

        int n = pairs.length;

        if (i >= n) {
            return 0;
        }

        if (dp[i][p + 1] != -1) {
            return dp[i][p + 1];
        }

        int take = 0;
        int skip = 0;

        // Take
        if (p == -1 || pairs[p][1] < pairs[i][0]) {
            take = 1 + solve(pairs, i + 1, i, dp);
        }

        // Skip
        skip = solve(pairs, i + 1, p, dp);

        return dp[i][p + 1] = Math.max(take, skip);
    }

    public int findLongestChain(int[][] pairs) {

        int n = pairs.length;

        // Sort pairs by starting value
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int dp[][] = new int[n][n + 1];

        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return solve(pairs, 0, -1, dp);
    }
}
