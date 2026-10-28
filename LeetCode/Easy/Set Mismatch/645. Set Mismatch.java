// 645. Set Mismatch [Easy]
// https://leetcode.com/problems/set-mismatch/
// Language: java | Runtime: 871 ms | Memory: 47.2 MB
// Time:  O(n²) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Nested loops
// Tags: Array, Hash Table, Bit Manipulation, Sorting
// Synced: 2026-10-29

class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=0,b=0;
        
        for(int i=1;i<=nums.length;i++){
            int count=0;

            for(int e:nums){
                if(e==i) count++;

            }
            
                if(count==2) a=i;

               else if(count==0) b=i;
        }
                return new int[]{a, b};

    }
}