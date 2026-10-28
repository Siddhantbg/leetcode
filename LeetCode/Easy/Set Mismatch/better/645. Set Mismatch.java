// 645. Set Mismatch [Easy]
// https://leetcode.com/problems/set-mismatch/
// Language: java | Runtime: 2 ms | Memory: 47.4 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Hash Table, Bit Manipulation, Sorting
// Synced: 2026-10-29

class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[]=new int[nums.length+1];
        int a=0,b=0;

        for(int e:nums) freq[e]++;
        
        for(int i=1;i<=nums.length;i++){
             
             if(freq[i]==2) a=i;

           else  if(freq[i]==0) b=i;
        }
        return new int[]{a,b};
    }
}