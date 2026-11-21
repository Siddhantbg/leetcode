// 1011. Capacity To Ship Packages Within D Days [Medium]
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Language: java | Runtime: 10 ms | Memory: 49.6 MB
// Time:  O(n log n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Binary search
// Tags: Array, Binary Search
// Synced: 2026-11-21

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;


        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
long daysN=1,load=0;
            
    for(int w:weights){
        if(w+load>mid){
            daysN++;
            load=0;
        }
        load+=w;
    }

            if(daysN<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}