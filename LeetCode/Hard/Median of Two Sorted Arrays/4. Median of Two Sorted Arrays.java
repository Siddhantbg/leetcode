// 4. Median of Two Sorted Arrays [Hard]
// https://leetcode.com/problems/median-of-two-sorted-arrays/
// Language: java | Runtime: 1 ms | Memory: 48.9 MB
// Time:  O(log(min(n1,n2)))
// Space: O(1)
// Tags: Array, Binary Search, Divide and Conquer
// Synced: 2026-08-08
//
// • Binary Search on the SMALLER array.
// 
// • Partition both arrays such that:
//     Left Half = Right Half
//     (or Left has one extra element for odd total size)
// 
// • Four important values:
//     l1, r1, l2, r2
// 
// • Correct partition when:
//     l1 <= r2
//     AND
//     l2 <= r1
// 
// • Even total elements:
//     Median = (max(l1,l2) + min(r1,r2)) / 2
// 
// • Odd total elements:
//     Median = max(l1,l2)
// 
// • If l1 > r2:
//     Move LEFT.
//     (high = cut1 - 1)
// 
// • Else:
//     Move RIGHT.
//     (low = cut1 + 1)
// 
// • Always Binary Search on the smaller array to achieve
//     O(log(min(n,m))) time.

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while (low <= high) {

            int cut1 = low + (high - low) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            // Correct Partition
            if (l1 <= r2 && l2 <= r1) {

                // Even number of elements
                if ((n1 + n2) % 2 == 0)
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;

                // Odd number of elements
                else
                    return Math.max(l1, l2);
            }

            // Move Left
            else if (l1 > r2) {
                high = cut1 - 1;
            }

            // Move Right
            else {
                low = cut1 + 1;
            }
        }

        return 0;
    }
}