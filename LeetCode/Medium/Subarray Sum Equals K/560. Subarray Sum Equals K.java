// 560. Subarray Sum Equals K [Medium]
// https://leetcode.com/problems/subarray-sum-equals-k/
// Language: java | Runtime: 25 ms | Memory: 48.3 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Hash map
// Tags: Array, Hash Table, Prefix Sum
// Synced: 2026-10-28

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> count=new HashMap<>();
        count.put(0,1);
        for(int x:nums){
            sum+=x;
            ans+=count.getOrDefault(sum-k,0);
            count.put(sum,count.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}