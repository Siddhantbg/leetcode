// 213. House Robber II [Medium]
// https://leetcode.com/problems/house-robber-ii/
// Language: java | Runtime: 0 ms | Memory: 42.3 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-11-24

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] t = new int[n + 1];   // size n+1, kyunki t[n] tak jaate hain

        // Case 1: first house lo, last chhodo (houses 0..n-2)
        t[0] = 0;
        t[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            int steal = nums[i - 1] + t[i - 2];
            int skip = t[i - 1];
            t[i] = Math.max(steal, skip);
        }
        int res1 = t[n - 1];

        // Case 2: first chhodo, last lo (houses 1..n-1)
        t[0] = 0;
        t[1] = 0;                   // house 0 allowed nahi
        for (int i = 2; i <= n; i++) {
            int steal = nums[i - 1] + t[i - 2];
            int skip = t[i - 1];
            t[i] = Math.max(steal, skip);
        }
        int res2 = t[n];

        return Math.max(res1, res2);
    }
}


// HOUSE ROBBER II – DRY RUN SCRIPT
// Input: nums = [1,2,3,1]   Expected: 4

// INTRO
// "Let me take a small example: [1,2,3,1]. Since the houses are in a circle, the first and last houses are neighbours, so I can't rob both. I'll run two cases and take the max."

// "n is 4, so the n == 1 check is skipped. I create an array t of size n+1 = 5, where t[i] means the maximum I can rob from the first i houses."

// CASE 1: Include first house, exclude last -> houses [1,2,3]
// "t[0] = 0, because zero houses means zero money. t[1] = nums[0] = 1."

// i | house | steal = nums[i-1] + t[i-2] | skip = t[i-1] | t[i]
// 2 |   2   | 2 + 0 = 2                  | 1             | 2
// 3 |   3   | 3 + 1 = 4                  | 2             | 4

// "At i = 2, if I rob this house I get 2 plus t[0], which is 2. If I skip it, I keep t[1], which is 1. The max is 2.
// At i = 3, robbing gives 3 plus t[1], which is 4, and skipping gives 2, so t[3] is 4.
// The loop stops at n-1, so res1 = 4."

// CASE 2: Exclude first house, include last -> houses [2,3,1]
// "I reuse the same array. t[0] = 0, and t[1] = 0 because the first house isn't allowed."

// i | house | steal     | skip | t[i]
// 2 |   2   | 2 + 0 = 2 | 0    | 2
// 3 |   3   | 3 + 0 = 3 | 2    | 3
// 4 |   1   | 1 + 2 = 3 | 3    | 3

// "This loop goes up to n, so res2 = t[4] = 3."

// RESULT
// "The final answer is max(4, 3) = 4. That matches the expected output: robbing house 1 and house 3 gives 1 + 3 = 4, and they aren't adjacent."

// EDGE CASE
// "Let me also check an edge case, [5]. Here n == 1, so I return 5 directly. That check matters, because without it the two cases would run on invalid ranges."

// COMPLEXITY
// "There are two loops, each O(n), so time is O(n). The array has size n+1, so space is O(n).
// I can bring space down to O(1) with two variables, because t[i] only depends on t[i-1] and t[i-2]."

// TIP
// While talking, build the table on the side and point at the matching code line for each row.