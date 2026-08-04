// 410. Split Array Largest Sum [Hard]
// https://leetcode.com/problems/split-array-largest-sum/
// Language: java | Runtime: 0 ms | Memory: 43.3 MB
// Time:  O(n*log(sum))
// Space: O(1)
// Tags: Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum
// Synced: 2026-08-05
//
// • Binary Search on Answer.
// 
// • Search space:
//     [max(nums), sum(nums)]
// 
// • Each subarray must be CONTIGUOUS.
// 
// • Greedily keep adding elements to the current subarray until
//   adding the next element exceeds the current limit.
//   Then start a new subarray.
// 
// • If required subarrays <= k:
//     Current maximum sum works.
//     Search LEFT for a smaller maximum.
// 
// • If required subarrays > k:
//     Current maximum sum is too small.
//     Search RIGHT.
// 
// • Return low after Binary Search ends.
// 
// • The minimum possible answer is:
//     max(nums)
//   because one subarray must contain the largest element.
// 
// • The maximum possible answer is:
//     sum(nums)
//   when the entire array forms one subarray.
// 
// • Same pattern as:
//     - Book Allocation Problem
//     - Painter's Partition
//     - Capacity to Ship Packages Within D Days (LC 1011)

class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canAllocate(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canAllocate(int[] nums, int k, int limit) {

        int usedSubarrays = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num <= limit) {
                currentSum += num;
            } else {
                usedSubarrays++;
                currentSum = num;

                if (usedSubarrays > k) {
                    return false;
                }
            }
        }

        return true;
    }
}