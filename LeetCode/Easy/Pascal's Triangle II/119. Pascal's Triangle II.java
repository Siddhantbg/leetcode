// 119. Pascal's Triangle II [Easy]
// https://leetcode.com/problems/pascals-triangle-ii/
// Language: java | Runtime: 0 ms | Memory: 41.7 MB
// Time:  O(n) (auto-detected)
// Space: O(n) (auto-detected)
// Tags: Array, Dynamic Programming
// Synced: 2026-10-24


class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);

        for (int k = 1; k <= r; k++) {
            val = val * (r - k + 1) / k;
            row.add((int) val);
        }

        return row;
    }
}
