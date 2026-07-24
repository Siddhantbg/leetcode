// 69. Sqrt(x) [Easy]
// https://leetcode.com/problems/sqrtx/
// Language: java | Runtime: 1 ms | Memory: 42.7 MB
// Tags: Math, Binary Search
// Synced: 2026-07-25

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