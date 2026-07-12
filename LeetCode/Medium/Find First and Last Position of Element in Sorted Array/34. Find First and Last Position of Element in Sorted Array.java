// 34. Find First and Last Position of Element in Sorted Array [Medium]
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 48.3 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-13
//
// • Solve using TWO Binary Searches.
// 
// • First Occurrence:
//     When target is found,
//     save the index and search LEFT.
// 
// • Last Occurrence:
//     When target is found,
//     save the index and search RIGHT.
// 
// • Never stop immediately after finding the target.
//   Continue searching to find the extreme occurrence.
// 
// • If target is absent,
//     return [-1, -1].
// 
// • This pattern is commonly used when handling duplicates in a sorted array.

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