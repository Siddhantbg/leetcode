// 33. Search in Rotated Sorted Array [Medium]
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 43.5 MB
// Time:  O(log n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Binary search
// Tags: Array, Binary Search
// Synced: 2026-11-21

class Solution {
    public int search(int[] nums, int target) {
        
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                return mid;
            }
            
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                                        high=mid-1;

                }else{
                                        low=mid+1;

                }

            }else{
                    if(nums[mid]<target && target<=nums[high]){
                                                low=mid+1;

                    }else{
                                                high=mid-1;

                    }
            }
            
        }

        return -1;
    }
}