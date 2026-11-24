# 213. House Robber II

- **Difficulty:** Medium
- **Link:** [house-robber-ii](https://leetcode.com/problems/house-robber-ii/)
- **Language:** java
- **File:** [`213. House Robber II.java`](213.%20House%20Robber%20II.java)
- **Time complexity:** O(n) _(auto-detected)_
- **Space complexity:** O(n) _(auto-detected)_
- **Runtime:** 0 ms
- **Memory:** 42.4 MB

## Notes

**TC O(n):** do loops chalte hain, aur har ek mein lagbhag `n` steps hote hain. Har step O(1) ka kaam hai (ek addition aur ek max), toh total `2n` banta hai, yaani O(n).

**SC O(n):** ek array `t` of size `n+1` hai, aur dono cases mein wahi reuse hota hai, toh O(n).

Bonus: `t[i]` sirf `t[i-1]` aur `t[i-2]` pe depend karta hai, toh array ki jagah do variables (`prev1`, `prev2`) rakhoge toh SC O(1) ho jayegi. Interview mein ye optimization bolna plus point hota hai.

_Last updated: 2026-11-24_
