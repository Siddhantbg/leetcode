// 2149. Rearrange Array Elements by Sign [Medium]
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
// Language: java | Runtime: 3 ms | Memory: 175.5 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Two Pointers, Simulation
// Synced: 2026-09-30

class Solution {
    public int[] rearrangeArray(int[] nums) {
        // two pointers
        int pos=0;
        int neg=1;
        int ans[]=new int[nums.length];

        for(int num:nums){
            if(num>0){
                ans[pos]=num;
                pos+=2;
            }else{
                ans[neg]=num;
                neg+=2;
            }
        }
        return ans;
    }
}