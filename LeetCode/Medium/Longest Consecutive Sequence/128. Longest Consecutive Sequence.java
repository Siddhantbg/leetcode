// 128. Longest Consecutive Sequence [Medium]
// https://leetcode.com/problems/longest-consecutive-sequence/
// Language: java | Runtime: 23 ms | Memory: 77.2 MB
// Time:  O(n log n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Sorting
// Tags: Array, Hash Table, Union-Find
// Synced: 2026-10-28

class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int best=0,len=0;
     for(int i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;

        if(i>0 && nums[i]==nums[i-1]+1) len++;
        else len=1;
      best=Math.max(best,len);  
     }  
return best;
    }
}