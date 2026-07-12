// 34. Find First and Last Position of Element in Sorted Array [Medium]
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 48.3 MB
// Tags: Array, Binary Search
// Synced: 2026-07-13

class Solution {

    public int[] searchRange(int[] nums, int target) {

        return new int[] { firstOccurrence(nums, target),
                           lastOccurrence(nums, target) };
    }

    private int firstOccurrence(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private int lastOccurrence(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}