// 167. Two Sum II - Input Array Is Sorted [Medium]
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Language: java | Runtime: 2 ms | Memory: 47.6 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Two pointers
// Tags: Array, Two Pointers, Binary Search
// Synced: 2026-10-16

class Solution {
    public int[] twoSum(int[] nums, int target) {
      
      int l=0;
      int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]<target){
                l++;
            }
            else if(nums[l]+nums[r]>target){
                r--;
            }else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{-1,-1};
    }
}