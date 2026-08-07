# 4. Median of Two Sorted Arrays

- **Difficulty:** Hard
- **Link:** [median-of-two-sorted-arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
- **Language:** java
- **File:** [`4. Median of Two Sorted Arrays.java`](4.%20Median%20of%20Two%20Sorted%20Arrays.java)
- **Time complexity:** O(log(min(n1,n2)))
- **Space complexity:** O(1)
- **Runtime:** 1 ms
- **Memory:** 48.9 MB

## Notes

• Binary Search on the SMALLER array.

• Partition both arrays such that:
    Left Half = Right Half
    (or Left has one extra element for odd total size)

• Four important values:
    l1, r1, l2, r2

• Correct partition when:
    l1 <= r2
    AND
    l2 <= r1

• Even total elements:
    Median = (max(l1,l2) + min(r1,r2)) / 2

• Odd total elements:
    Median = max(l1,l2)

• If l1 > r2:
    Move LEFT.
    (high = cut1 - 1)

• Else:
    Move RIGHT.
    (low = cut1 + 1)

• Always Binary Search on the smaller array to achieve
    O(log(min(n,m))) time.

_Last updated: 2026-08-08_
