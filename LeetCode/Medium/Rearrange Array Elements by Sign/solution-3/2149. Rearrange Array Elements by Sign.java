// 2149. Rearrange Array Elements by Sign [Medium]
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Language: java | Runtime: 4 ms | Memory: 175 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Simulation
// Synced: 2026-10-31

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int posIndex=0, negIndex=1;
int[] ans = new int[n];
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