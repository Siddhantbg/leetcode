// 1. Two Sum [Easy]
// https://leetcode.com/problems/two-sum/
// Language: java | Runtime: 2 ms | Memory: 46.7 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Hash map
// Tags: Array, Hash Table
// Synced: 2026-11-22

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            
        if(map.containsKey(need)){
            return new int[]{map.get(need),i};    
            }
        map.put(nums[i],i);        
    }
    return new int[]{-1,-1};
    }
}