// 1901. Find Peak Element II [Medium]
// https://leetcode.com/problems/find-peak-element-ii/
// Language: java
// Time:  O(rows x log(cols))
// Space: O(1)
// Tags: Array, Binary Search, Matrix
// Synced: 2026-09-08
//
// • 2D version of Find Peak Element.
//
// • Binary Search on COLUMNS.
//
// • For every middle column:
//     Find its maximum element.
//
// • Column maximum is already greater than:
//     UP and DOWN.
//
// • Compare it with:
//     LEFT and RIGHT.
//
// • If current > left AND right:
//     Peak found.
//
// • If right > current:
//     Search RIGHT.
//
// • Otherwise:
//     Search LEFT.
//
// • Time:
//     O(rows x log(cols))
//
// • Space:
//     O(1)
//
// • Pattern:
//     Binary Search + Find Maximum in Column

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int low = 0;
        int high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int maxRow = 0;
            for (int r = 1; r < rows; r++) {
                if (mat[r][mid] > mat[maxRow][mid]) {
                    maxRow = r;
                }
            }

            int left = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int right = mid + 1 < cols ? mat[maxRow][mid + 1] : -1;
            int cur = mat[maxRow][mid];

            if (cur > left && cur > right) {
                return new int[] { maxRow, mid };
            } else if (right > cur) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[] { -1, -1 };
    }
}
