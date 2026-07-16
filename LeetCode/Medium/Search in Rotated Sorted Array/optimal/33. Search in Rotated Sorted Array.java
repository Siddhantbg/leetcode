// 33. Search in Rotated Sorted Array [Medium]
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 43.9 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-17
//
// • In every iteration, at least ONE half of the array is sorted.
// 
// • First identify the sorted half:
//     nums[low] <= nums[mid]
//     => Left half is sorted.
//     Otherwise, right half is sorted.
// 
// • After identifying the sorted half,
//   check if the target lies inside it.
// 
// • If target lies in the sorted half,
//     search there.
//   Otherwise,
//     search the other half.
// 
// • Do NOT find the pivot separately.
//   The problem is solvable in a single Binary Search.
// 
// • This approach works only because there are NO duplicate elements.
//   With duplicates, the logic changes (LeetCode 81).

class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // Right half is sorted
            else {

                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}