// 410. Split Array Largest Sum [Hard]
// https://leetcode.com/problems/split-array-largest-sum/
// Language: java | Runtime: 0 ms | Memory: 43.3 MB
// Tags: Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum
// Synced: 2026-08-05

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