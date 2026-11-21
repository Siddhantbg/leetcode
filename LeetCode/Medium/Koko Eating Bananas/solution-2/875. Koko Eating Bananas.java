// 875. Koko Eating Bananas [Medium]
// https://leetcode.com/problems/koko-eating-bananas/
// Language: java | Runtime: 8 ms | Memory: 47.6 MB
// Time:  O(n log n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Binary search
// Tags: Array, Binary Search
// Synced: 2026-11-21

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        for(int p:piles){
            high=Math.max(high,p);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
long hrs=0;

            for(int p:piles){
                hrs+=(p+mid-1)/mid;
            }
            if(hrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}