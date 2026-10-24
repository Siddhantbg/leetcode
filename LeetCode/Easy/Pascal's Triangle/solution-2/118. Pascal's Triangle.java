// 118. Pascal's Triangle [Easy]
// https://leetcode.com/problems/pascals-triangle/
// Language: java | Runtime: 1 ms | Memory: 43.1 MB
// Time:  O(m·n) (auto-detected)
// Space: O(n) (auto-detected)
// Pattern: Nested loops
// Tags: Array, Dynamic Programming
// Synced: 2026-10-24

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{

                List<Integer> prev= triangle.get(i-1);
                row.add(prev.get(j-1)+prev.get(j));
            }
            }
                triangle.add(row);
        }
        return triangle;
    }
}