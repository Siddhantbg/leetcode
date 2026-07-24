// 1283. Find the Smallest Divisor Given a Threshold [Medium]
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Language: java | Runtime: 6 ms | Memory: 50.9 MB
// Time:  O(n*log(max(nums)))
// Space: O(1)
// Tags: Array, Binary Search
// Synced: 2026-07-25
//
// • This is a Binary Search on Answer problem.
// 
// • Search space = [1, max(nums)].
// 
// • Compute:
//     sum = Σ ceil(nums[i] / divisor)
// 
// • If sum <= threshold:
//     Current divisor works.
//     Search LEFT for a smaller valid divisor.
// 
// • If sum > threshold:
//     Divisor is too small.
//     Search RIGHT.
// 
// • Return low after Binary Search ends.
// 
// • Avoid Math.ceil().
//   Use integer formula:
//     (num + divisor - 1) / divisor
// 
// • The monotonic property is:
//     Larger divisor -> Smaller (or equal) sum.

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,h=0;

        for(int n:nums){
            h=Math.max(h,n);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            int sum=0;

            for(int n:nums){
                sum+=(n+mid-1)/mid;
            }

            if(sum<=threshold){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}