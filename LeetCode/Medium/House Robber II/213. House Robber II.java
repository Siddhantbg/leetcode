// 213. House Robber II [Medium]
// https://leetcode.com/problems/house-robber-ii/
// Language: java | Runtime: 0 ms | Memory: 42.4 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Synced: 2026-11-24
//
// **TC O(n):** do loops chalte hain, aur har ek mein lagbhag `n` steps hote hain. Har step O(1) ka kaam hai (ek addition aur ek max), toh total `2n` banta hai, yaani O(n).
// 
// **SC O(n):** ek array `t` of size `n+1` hai, aur dono cases mein wahi reuse hota hai, toh O(n).
// 
// Bonus: `t[i]` sirf `t[i-1]` aur `t[i-2]` pe depend karta hai, toh array ki jagah do variables (`prev1`, `prev2`) rakhoge toh SC O(1) ho jayegi. Interview mein ye optimization bolna plus point hota hai.

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] t = new int[n + 1];   // size n+1, kyunki t[n] tak jaate hain

        // Case 1: first house lo, last chhodo (houses 0..n-2)
        t[0] = 0;
        t[1] = nums[0];
        for (int i = 2; i <= n - 1; i++) {
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