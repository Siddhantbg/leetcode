// 704. Binary Search [Easy]
// https://leetcode.com/problems/binary-search/
// Language: java | Runtime: 0 ms | Memory: 47.8 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-12
//
// • Binary Search works only when the search space is sorted or monotonic.
// 
// • Always calculate middle as:
//   mid = low + (high - low) / 2
//   to avoid integer overflow.
// 
// • Search space is always [low, high].
// 
// • Loop condition should be:
//   while (low <= high)
// 
// • If arr[mid] < target:
//       low = mid + 1
// 
// • If arr[mid] > target:
//       high = mid - 1
// 
// • Never use:
//       low = mid
//       high = mid
//   as it can lead to an infinite loop.
// 
// • Binary Search reduces the search space by half every iteration.

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}