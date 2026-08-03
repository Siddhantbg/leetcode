// 1552. Magnetic Force Between Two Balls [Medium]
// https://leetcode.com/problems/magnetic-force-between-two-balls/
// Language: java | Runtime: 43 ms | Memory: 78.7 MB
// Tags: Array, Binary Search, Sorting
// Synced: 2026-08-04

class Solution {

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(position, m, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    private boolean canPlace(int[] position, int balls, int distance) {

        int placed = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - last >= distance) {

                placed++;
                last = position[i];

                if (placed == balls)
                    return true;
            }
        }

        return false;
    }
}