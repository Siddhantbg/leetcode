# 1552. Magnetic Force Between Two Balls

- **Difficulty:** Medium
- **Link:** [magnetic-force-between-two-balls](https://leetcode.com/problems/magnetic-force-between-two-balls/)
- **Language:** java
- **File:** [`1552. Magnetic Force Between Two Balls.java`](1552.%20Magnetic%20Force%20Between%20Two%20Balls.java)
- **Time complexity:** O(n log n+n*log(maxDistance)))
- **Space complexity:** O(1)
- **Runtime:** 43 ms
- **Memory:** 78.7 MB

## Notes

• This is exactly the Aggressive Cows problem.

• Only the story changes:
    Stalls -> Basket positions
    Cows -> Balls

• Binary Search on Answer.

• Sort the positions first.

• Search space:
    [1, maxPosition - minPosition]

• Greedily place each ball in the leftmost valid basket.

• If current distance works:
    Search RIGHT.
    (We're maximizing the minimum distance.)

• If current distance doesn't work:
    Search LEFT.

• Return high after Binary Search ends.

_Last updated: 2026-08-04_
