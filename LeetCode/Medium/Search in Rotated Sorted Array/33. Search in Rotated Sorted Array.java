// 33. Search in Rotated Sorted Array [Medium]
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 43.6 MB
// Time:  O(n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-12

class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
                    return -1;

    }
}