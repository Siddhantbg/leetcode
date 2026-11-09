// 119. Pascal's Triangle II [Easy]
// https://leetcode.com/problems/pascals-triangle-ii/
// Language: java | Runtime: 0 ms | Memory: 42.3 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-11-09

class Solution {
    public List<Integer> getRow(int rowIndex) {
        long val=1;
        
        int n=rowIndex; 

        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=n;i++){
            val=val*(n-i+1)/i;
            row.add((int)val);
        }
        return row;
    }
}