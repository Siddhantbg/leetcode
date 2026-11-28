// 646. Maximum Length of Pair Chain [Medium]
// https://leetcode.com/problems/maximum-length-of-pair-chain/
// Language: java | Runtime: 32 ms | Memory: 46.5 MB
// Time:  O(m·n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Dynamic programming + Sorting
// Tags: Array, Dynamic Programming, Greedy, Sorting, Longest Increasing Subsequence
// Synced: 2026-11-28


class Solution {
    public int findLongestChain(int[][] pairs) {

        int n = pairs.length;

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int dp[] = new int[n];

        Arrays.fill(dp, 1);

        int mLis = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (pairs[j][1] < pairs[i][0]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }

            mLis = Math.max(mLis, dp[i]);
        }

        return mLis;
    }
}
