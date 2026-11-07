// 48. Rotate Image [Medium]
// https://leetcode.com/problems/rotate-image/
// Language: java | Runtime: 0 ms | Memory: 43.3 MB
// Time:  O(m·n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Reverse traversal
// Tags: Array, Math, Matrix
// Synced: 2026-11-07

class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }

        for(int [] row:matrix){
            for(int l=0,r=matrix.length-1;l<r;l++,r--){
                int tmp=row[l];
                row[l]=row[r];
                row[r]=tmp;
            }
        }
    }
}