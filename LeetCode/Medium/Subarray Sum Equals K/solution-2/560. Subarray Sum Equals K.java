// 560. Subarray Sum Equals K [Medium]
// https://leetcode.com/problems/subarray-sum-equals-k/
// Language: java | Runtime: 26 ms | Memory: 48 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Hash map
// Tags: Array, Hash Table, Prefix Sum
// Synced: 2026-11-07

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0,sum=0;
        for(int x:nums){
            sum+=x;
            ans+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}