// 162. Find Peak Element [Medium]
// https://leetcode.com/problems/find-peak-element/
// Language: java | Runtime: 0 ms | Memory: 43.9 MB
// Time:  O(rows × log(cols))
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-09-05
//
// • 2D version of Find Peak Element.
// 
// • Binary Search on COLUMNS.
// 
// • For every middle column:
//     Find its maximum element.
// 
// • Column maximum is already greater than:
//     UP and DOWN.
// 
// • Compare it with:
//     LEFT and RIGHT.
// 
// • If current > left AND right:
//     Peak found.
// 
// • If right > current:
//     Search RIGHT.
// 
// • Otherwise:
//     Search LEFT.
// 
// • Time:
//     O(rows × log(cols))
// 
// • Space:
//     O(1)
// 
// • Pattern:
//     Binary Search + Find Maximum in Column

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Going UP → peak is on the right
                low = mid + 1;
            } else {
                // Going DOWN → peak is at mid or on the left
                high = mid;
            }
        }

        return low;
    }
}