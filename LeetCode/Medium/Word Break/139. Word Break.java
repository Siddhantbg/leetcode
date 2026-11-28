// 139. Word Break [Medium]
// https://leetcode.com/problems/word-break/
// Language: java | Runtime: 7 ms | Memory: 45.7 MB
// Pattern: Memoization
// Tags: Array, Hash Table, String, Dynamic Programming, Trie, Memoization, Brute-Force Search
// Synced: 2026-11-28


class Solution {

    Boolean[] dp;
    int n;

    private boolean solve(String s, int idx, List<String> wordDict) {

        // Base case
        if (idx == n) {
            return true;
        }

        // Memoization
        if (dp[idx] != null) {
            return dp[idx];
        }

        // Try every possible substring
        for (int end = idx + 1; end <= n; end++) {

            String sub = s.substring(idx, end);

            if (wordDict.contains(sub) && solve(s, end, wordDict)) {
                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        n = s.length();
        dp = new Boolean[n];

        return solve(s, 0, wordDict);
    }
}
