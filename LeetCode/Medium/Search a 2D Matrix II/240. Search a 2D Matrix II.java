// 240. Search a 2D Matrix II [Medium]
// https://leetcode.com/problems/search-a-2d-matrix-ii/
// Language: java | Runtime: 3 ms | Memory: 48.3 MB
// Time:  O(m+n)
// Space: O(1)
// Tags: Array, Binary Search, Divide and Conquer, Matrix
// Synced: 2026-09-05

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (target < matrix[row][col]) {
                col--;
            }
            else if (target > matrix[row][col]) {
                row++;
            }
            else {
                return true;
            }
        }

        return false;
    }
}