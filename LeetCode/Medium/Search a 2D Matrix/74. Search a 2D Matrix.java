// 74. Search a 2D Matrix [Medium]
// https://leetcode.com/problems/search-a-2d-matrix/
// Language: java | Runtime: 0 ms | Memory: 43.7 MB
// Time:  O(log m*n)
// Space: O(1)
// Tags: Array, Binary Search, Matrix
// Synced: 2026-09-04

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } 
            else if (matrix[row][col] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}