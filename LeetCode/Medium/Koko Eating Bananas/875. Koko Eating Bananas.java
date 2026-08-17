// 875. Koko Eating Bananas [Medium]
// https://leetcode.com/problems/koko-eating-bananas/
// Language: java | Runtime: 7 ms | Memory: 47.7 MB
// Tags: Array, Binary Search
// Synced: 2026-08-18

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        for(int pile:piles){
            high=Math.max(high,pile);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            long hrs=0;

            for(int pile:piles){
                hrs+=(pile+mid-1)/mid;//ceil (pile/speed) mid is speed
                //cant use ceil coz (pile / mid) performs integer division in Java. This truncates the decimal part before Math.ceil() can round it up.
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