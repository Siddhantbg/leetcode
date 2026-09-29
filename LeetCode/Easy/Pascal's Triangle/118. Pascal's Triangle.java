// 118. Pascal's Triangle [Easy]
// https://leetcode.com/problems/pascals-triangle/
// Language: java | Runtime: 1 ms | Memory: 43.4 MB
// Time:  O(n^2)
// Space: O(n^2)
// Pattern: Nested loops
// Synced: 2026-09-30
//
// Dont try to calculate every value using factorials, combination. The triagnle's previous row already gives you exactly what you need.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();

            row.add(1);

            for(int j=1;j<i;j++){
                row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            if(i>0){
                row.add(1);
            }
            ans.add(row);
        }
return ans;
    }
}

// ans.get(1).get(0)

// Look at ans:

// ans = [
//     [1],       ← index 0
//     [1,1]      ← index 1
// ]

// So:

// ans.get(1) = [1,1]

// And:

// ans.get(1).get(0) = 1