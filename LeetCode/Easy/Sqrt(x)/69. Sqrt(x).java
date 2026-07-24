// 69. Sqrt(x) [Easy]
// https://leetcode.com/problems/sqrtx/
// Language: java | Runtime: 1 ms | Memory: 42.7 MB
// Time:  O(log n)
// Space: O(1)
// Tags: Math, Binary Search
// Synced: 2026-07-25
//
// • This is the first classic Binary Search on Answer problem.
// 
// • Search space is [1, x], not an array.
// 
// • If mid² <= x:
//     mid is a valid answer.
//     Store it and search RIGHT.
// 
// • If mid² > x:
//     Search LEFT.
// 
// • Return the largest value whose square is <= x.
// 
// • Never use:
//     mid * mid
//   directly with int.
//   Use:
//     (long) mid * mid
//   or
//     mid <= x / mid
//   to avoid integer overflow.
// 
// • Binary Search on Answer is used whenever the answer itself lies in a monotonic range.

class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;

        int l=1,h=x,ans=0;

        while(l<=h){
            int mid=l+(h-l)/2;
            if((long)mid*mid<=x){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}