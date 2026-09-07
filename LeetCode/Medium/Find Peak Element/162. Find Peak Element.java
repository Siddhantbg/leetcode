// 162. Find Peak Element [Medium]
// https://leetcode.com/problems/find-peak-element/
// Language: java | Runtime: 0 ms | Memory: 43.9 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-09-08
//
// • Binary Search on the slope.
//
// • Compare only:
//     nums[mid] and nums[mid + 1].
//
// • If nums[mid] < nums[mid + 1]:
//     You're on an increasing slope.
//     Search RIGHT.
//
// • If nums[mid] > nums[mid + 1]:
//     You're on a decreasing slope.
//     Search LEFT (including mid).
//
// • Use:
//     while (low < high)
//
// • When low == high,
//     that index is guaranteed to be a peak.
//
// • Don't use:
//     high = mid - 1
//   because mid itself may be the peak.
//
// • There can be multiple peaks.
//   Returning any one is valid.

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Going UP -> peak is on the right
                low = mid + 1;
            } else {
                // Going DOWN -> peak is at mid or on the left
                high = mid;
            }
        }

        return low;
    }
}
