// 540. Single Element in a Sorted Array [Medium]
// https://leetcode.com/problems/single-element-in-a-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 52.9 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-21
//
// • Before the single element:
//     Every pair starts at an EVEN index.
// 
// • After the single element:
//     Every pair starts at an ODD index.
// 
// • First check edge cases:
//     - Single element array
//     - First element is unique
//     - Last element is unique
// 
// • If nums[mid] is different from both neighbors,
//   it is the answer.
// 
// • If the pairing pattern is correct,
//   search RIGHT.
// 
// • If the pairing pattern is broken,
//   search LEFT.
// 
// • The key is observing the index pattern,
//   not the element values.

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