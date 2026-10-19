// 2149. Rearrange Array Elements by Sign [Medium]
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Language: java | Runtime: 4 ms | Memory: 174.9 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Simulation
// Synced: 2026-10-19

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int posIndex=0; int negIndex=1;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            }else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return ans;
    }
}