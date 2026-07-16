// 81. Search in Rotated Sorted Array II [Medium]
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Language: java | Runtime: 0 ms | Memory: 44.9 MB
// Tags: Array, Binary Search
// Synced: 2026-07-17

class Solution {
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return true;

            // New condition for duplicates
            if (nums[low] == nums[mid] &&
                nums[mid] == nums[high]) {

                low++;
                high--;
                continue;
            }

            // Left half sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target &&
                    target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // Right half sorted
            else {

                if (nums[mid] < target &&
                    target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return false;
    }
}