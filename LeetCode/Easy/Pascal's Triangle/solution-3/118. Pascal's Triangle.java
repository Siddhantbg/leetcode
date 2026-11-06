// 118. Pascal's Triangle [Easy]
// https://leetcode.com/problems/pascals-triangle/
// Language: java | Runtime: 1 ms | Memory: 43 MB
// Time:  O(m·n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Nested loops
// Tags: Array, Dynamic Programming
// Synced: 2026-11-06

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        int n=numRows;
        
        for(int i=0;i<n;i++){
            List<Integer> rows=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    rows.add(1);
                }
                else{
                    List<Integer> e=triangle.get(i-1);
                    rows.add(e.get(j-1)+e.get(j));
                }
            }
            triangle.add(rows);
        }
        return triangle;
    }
}