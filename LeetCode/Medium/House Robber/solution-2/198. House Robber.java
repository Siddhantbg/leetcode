// 198. House Robber [Medium]
// https://leetcode.com/problems/house-robber/
// Language: java | Runtime: 0 ms | Memory: 42.2 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-11-24

class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;

        if(n==1){
            return nums[0];
        }

        int[]t=new int[n+1];
//no house
        t[0]=0;
//1st house
        t[1]=nums[0];

        for(int i=2;i<=n;i++){
            int steal=nums[i-1]+t[i-2];
            int skip=t[i-1];
            
            t[i]=Math.max(steal,skip);
        }

        return t[n];
    }
}