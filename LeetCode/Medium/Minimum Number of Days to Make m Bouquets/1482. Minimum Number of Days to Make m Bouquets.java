// 1482. Minimum Number of Days to Make m Bouquets [Medium]
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
// Language: java | Runtime: 17 ms | Memory: 82.8 MB
// Tags: Array, Binary Search
// Synced: 2026-08-03

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int day:bloomDay){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(canMakeBouq(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
                    return low;

    }
        private boolean canMakeBouq(int[] bloomDay,int day,int m,int k){
            int bouquets=0;
            int flowers=0;

            for(int bloom:bloomDay){
                if(bloom<=day){
                    flowers++;

                    if(flowers==k){
                        bouquets++;
                        flowers=0;
                    }

                }else{
                    flowers=0;
                }
            }
            return bouquets>=m;
        }
    }