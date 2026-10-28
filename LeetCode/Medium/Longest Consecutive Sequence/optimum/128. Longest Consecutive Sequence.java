// 128. Longest Consecutive Sequence [Medium]
// https://leetcode.com/problems/longest-consecutive-sequence/
// Language: java | Runtime: 31 ms | Memory: 95.1 MB
// Space: O(n) (auto-detected)
// Pattern: Hash set
// Tags: Array, Hash Table, Union-Find
// Synced: 2026-10-28

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<>();

        for(int x:nums) map.add(x);
int best=0;
        for(int x:map){
            if(map.contains(x-1)) continue;

            int len=1,curr=x;

            while(map.contains(curr+1)){
                curr++;
                len++;
            }
        best=Math.max(best,len);
        }
    return best;
    }
}