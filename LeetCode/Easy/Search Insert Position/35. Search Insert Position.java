// 35. Search Insert Position [Easy]
// https://leetcode.com/problems/search-insert-position/
// Language: java | Runtime: 0 ms | Memory: 44.8 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-13
//
// • Search Insert Position is exactly the Lower Bound problem.
// 
// • Answer = First index where nums[i] >= target.
// 
// • If the target exists:
//     Return its index.
// 
// • If the target doesn't exist:
//     Return the index where it should be inserted.
// 
// • Elegant implementation:
//     Don't store ans.
//     Return low after the loop.
// 
// • At loop termination:
//     All elements before low are < target.
//     All elements from low onward are >= target.
//     Hence, low is the insertion position.

class Solution {
    public int searchInsert(int[] nums, int target) {
     int l=0;
     int h=nums.length-1;
int ans=nums.length; 
// nums[mid]>=target
     while(l<=h){
        int mid=l+(h-l)/2;

        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>=target){
            ans=mid;
            h=mid-1;
        }else{
            l=mid+1;
        }
     }
     return ans;   
    }
}