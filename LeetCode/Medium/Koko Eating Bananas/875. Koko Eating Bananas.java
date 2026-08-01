// 875. Koko Eating Bananas [Medium]
// https://leetcode.com/problems/koko-eating-bananas/
// Language: java | Runtime: 7 ms | Memory: 47.9 MB
// Tags: Array, Binary Search
// Synced: 2026-08-02
//
// • Binary Search on Answer.
// 
// • Search space = [1, max(piles)].
// 
// • Compute:
//     hours = Σ ceil(pile / speed)
// 
// • If hours <= h:
//     Current speed works.
//     Search LEFT for a smaller valid speed.
// 
// • If hours > h:
//     Speed is too slow.
//     Search RIGHT.
// 
// • Return low after Binary Search ends.
// 
// • Avoid Math.ceil().
//   Use:
//     (pile + speed - 1) / speed
// 
// • This problem has the exact same pattern as:
//     - Smallest Divisor
//     - Minimum Days to Make Bouquets
//     - Ship Packages Within D Days
//     - Capacity to Ship Packages

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
                hrs+=(pile+mid-1)/mid;
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