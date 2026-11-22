// 475. Heaters [Medium]
// https://leetcode.com/problems/heaters/
// Language: java | Runtime: 18 ms | Memory: 47.4 MB
// Time:  O(m logm + nlogn m)
// Space: O(1) (auto-detected)
// Pattern: Binary search + Sorting
// Synced: 2026-11-22

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);

        int ans=0;

        for(int house:houses){
            int low=0;
            int high=heaters.length-1;
            int idx=heaters.length;
            while(low<=high){
                int mid=low+(high-low)/2;

                if(heaters[mid]>=house){
                    idx=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            int rightDist;
            if(idx<heaters.length){
                rightDist=heaters[idx]-house;
            }else{
                rightDist=Integer.MAX_VALUE;
            }

            int leftDist;
            if(idx>0){
                leftDist=house-heaters[idx-1];
            }else{
                leftDist=Integer.MAX_VALUE;
            }
            int nearest=Math.min(leftDist,rightDist);
            ans=Math.max(ans,nearest);
        }
        return ans;
    }
}