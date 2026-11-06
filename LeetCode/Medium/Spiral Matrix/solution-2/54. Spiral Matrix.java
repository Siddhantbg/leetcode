// 54. Spiral Matrix [Medium]
// https://leetcode.com/problems/spiral-matrix/
// Language: java | Runtime: 0 ms | Memory: 42.4 MB
// Space: O(n) (auto-detected)
// Pattern: Two pointers + Reverse traversal
// Tags: Array, Matrix, Simulation
// Synced: 2026-11-06

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int top=0;
//left to right
//top to bottom
// right to left
//bottom to top
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;

        List<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=right){

            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ans.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    ans.add(matrix[j][left]);
                }
                left++;
            }
        }
        return ans;
    }
}