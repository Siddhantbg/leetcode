// 1. Two Sum [Easy]
// https://leetcode.com/problems/two-sum/
// Language: java | Runtime: 3 ms | Memory: 47.1 MB
// Tags: Array, Hash Table
// Synced: 2026-09-03

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }   
        return new int[]{-1,-1};
    }
}