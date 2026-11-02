// 2149. Rearrange Array Elements by Sign [Medium]
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Language: java | Runtime: 4 ms | Memory: 174.9 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Simulation
// Synced: 2026-11-02

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posI=0; int negI=1;
int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posI]=nums[i];
                posI+=2;
            }
            else{
                ans[negI]=nums[i];
                negI+=2;
            }
        }
        return ans;
    }
}