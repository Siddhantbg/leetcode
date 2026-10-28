// 645. Set Mismatch [Easy]
// https://leetcode.com/problems/set-mismatch/
// Language: java | Runtime: 2 ms | Memory: 47.1 MB
// Time:  O(n) (auto-detected)
// Space: O(1) (auto-detected)
// Tags: Array, Hash Table, Bit Manipulation, Sorting
// Synced: 2026-10-29

class Solution {
    public int[] findErrorNums(int[] nums) {
        long n=nums.length;
long s1=0,s2=0;
long sn1=n*(n+1)/2;
long sn2=n*(n+1)*(2*n+1)/6;
        for(int i:nums){
            s1+=i;
            s2+=(long) i*i;
        }

        long diff=s1-sn1;
        long sqdiff=s2-sn2;

        long sum=sqdiff/diff;

        long a=(diff+sum)/2;
        long b=a-diff;
        return new int[]{(int)a,(int)b};   
    }
}