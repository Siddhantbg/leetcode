// 1283. Find the Smallest Divisor Given a Threshold [Medium]
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
// Language: java | Runtime: 6 ms | Memory: 50.9 MB
// Tags: Array, Binary Search
// Synced: 2026-07-25

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