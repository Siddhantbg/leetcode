// 48. Rotate Image [Medium]
// https://leetcode.com/problems/rotate-image/
// Language: java | Runtime: 0 ms | Memory: 43.1 MB
// Time:  O(m·n) (auto-detected)
// Space: O(1) (auto-detected)
// Pattern: Reverse traversal
// Tags: Array, Math, Matrix
// Synced: 2026-10-27

class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int[] row:matrix){
        for(int l=0,r=n-1;l<r;l++,r--){
            int tmp=row[l];
            row[l]=row[r];
            row[r]=tmp;
        }   
    
    }
    }
}