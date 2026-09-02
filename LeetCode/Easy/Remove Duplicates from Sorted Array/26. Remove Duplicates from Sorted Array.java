// 26. Remove Duplicates from Sorted Array [Easy]
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Language: java | Runtime: 0 ms | Memory: 46.6 MB
// Tags: Array, Two Pointers
// Synced: 2026-09-03

class Solution {
    public int removeDuplicates(int[] nums) {
        int u=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[u]){
                u++;
                nums[u]=nums[i];
            }
        }
        return u+1;
    }
}