// 2149. Rearrange Array Elements by Sign [Medium]
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Language: java | Runtime: 4 ms | Memory: 171.6 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Simulation
// Synced: 2026-10-19

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []pos=new int[n/2];
        int []neg=new int[n/2];
        int p=0;int q=0;

        for(int e:nums){
            if(e>0){
                pos[p++]=e;
            }else{
                neg[q++]=e;
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
}