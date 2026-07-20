// 540. Single Element in a Sorted Array [Medium]
// https://leetcode.com/problems/single-element-in-a-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 52.9 MB
// Tags: Array, Binary Search
// Synced: 2026-07-21

class Solution {

    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        if (nums[0] != nums[1]) return nums[0];

        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Single element found
            if (nums[mid] != nums[mid - 1] &&
                nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Pattern is correct, move right
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {

                low = mid + 1;
            }

            // Pattern broken, move left
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}