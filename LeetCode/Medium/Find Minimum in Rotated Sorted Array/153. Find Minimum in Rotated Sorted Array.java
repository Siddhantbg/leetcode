// 153. Find Minimum in Rotated Sorted Array [Medium]
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 44 MB
// Tags: Array, Binary Search
// Synced: 2026-07-18

class Solution {
    public int findMin(int[] nums) {
        int l=0, h=nums.length-1;

        int ans=Integer.MAX_VALUE;
        
        while(l<=h){
            if(nums[l]<=nums[h]){
                ans=Math.min(ans,nums[l]);
                break;
            }

            int mid=l+(h-l)/2;

            if(nums[l]<=nums[mid]){
                l=mid+1;
                ans=Math.min(ans,nums[l]);
            }else{
                h=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}