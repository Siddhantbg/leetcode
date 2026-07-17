// 153. Find Minimum in Rotated Sorted Array [Medium]
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 44 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-18
//
// • If nums[low] <= nums[high],
//   the current search space is already sorted.
//   The minimum is nums[low].
// 
// • One half is always sorted.
// 
// • If left half is sorted:
//     Save nums[low].
//     Search RIGHT.
// 
// • If right half is sorted:
//     Save nums[mid].
//     Search LEFT.
// 
// • Keep track of the minimum using:
//     ans = Math.min(ans, ...)
// 
// • This problem assumes all elements are UNIQUE.
//   With duplicates, the logic changes (LeetCode 154).

class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,ans=Integer.MAX_VALUE;

        while(l<=h){
            if(nums[l]<=nums[h]){
                ans=Math.min(nums[l],ans);
                break;
            }
            int mid=l+(h-l)/2;
             if(nums[l]<=nums[mid]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                h=mid-1;
            }
        }
        return ans;
    }
}