// 704. Binary Search [Easy]
// https://leetcode.com/problems/binary-search/
// Language: java | Runtime: 0 ms | Memory: 47.8 MB
// Tags: Array, Binary Search
// Synced: 2026-07-12

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