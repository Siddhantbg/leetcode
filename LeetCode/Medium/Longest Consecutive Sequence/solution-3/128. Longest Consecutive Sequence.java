// 128. Longest Consecutive Sequence [Medium]
// https://leetcode.com/problems/longest-consecutive-sequence/
// Language: java | Runtime: 35 ms | Memory: 95.2 MB
// Space: O(n) (auto-detected)
// Pattern: Hash set
// Tags: Array, Hash Table, Union-Find
// Synced: 2026-11-10

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<>();

        for(int x:nums) map.add(x);
int best=0;
        for(int x:map){
            if(map.contains(x-1)) continue;

            int len=1,curr=x;

            while(map.contains(curr+1)){
                len++;
                curr++;
            }

            best=Math.max(best,len);
        }
        return best;
    }
}