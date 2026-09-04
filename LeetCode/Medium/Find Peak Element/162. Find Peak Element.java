// 162. Find Peak Element [Medium]
// https://leetcode.com/problems/find-peak-element/
// Language: java | Runtime: 0 ms | Memory: 43.9 MB
// Tags: Array, Binary Search
// Synced: 2026-09-05

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