// 162. Find Peak Element [Medium]
// https://leetcode.com/problems/find-peak-element/
// Language: java | Runtime: 0 ms | Memory: 44.2 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-08-07
//
// • Binary Search on the slope.
// 
// • Compare only:
//     nums[mid] and nums[mid + 1].
// 
// • If nums[mid] < nums[mid + 1]:
//     You're on an increasing slope.
//     Search RIGHT.
// 
// • If nums[mid] > nums[mid + 1]:
//     You're on a decreasing slope.
//     Search LEFT (including mid).
// 
// • Use:
//     while (low < high)
// 
// • When low == high,
//     that index is guaranteed to be a peak.
// 
// • Don't use:
//     high = mid - 1
//   because mid itself may be the peak.
// 
// • There can be multiple peaks.
//   Returning any one is valid.

class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,h=nums.length-1;

        while(l<h){
            int mid=l+(h-l)/2;

            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        return l;
    }
}