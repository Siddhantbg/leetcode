// 1552. Magnetic Force Between Two Balls [Medium]
// https://leetcode.com/problems/magnetic-force-between-two-balls/
// Language: java | Runtime: 43 ms | Memory: 78.7 MB
// Time:  O(n log n+n*log(maxDistance)))
// Space: O(1)
// Tags: Array, Binary Search, Sorting
// Synced: 2026-08-04
//
// • This is exactly the Aggressive Cows problem.
// 
// • Only the story changes:
//     Stalls -> Basket positions
//     Cows -> Balls
// 
// • Binary Search on Answer.
// 
// • Sort the positions first.
// 
// • Search space:
//     [1, maxPosition - minPosition]
// 
// • Greedily place each ball in the leftmost valid basket.
// 
// • If current distance works:
//     Search RIGHT.
//     (We're maximizing the minimum distance.)
// 
// • If current distance doesn't work:
//     Search LEFT.
// 
// • Return high after Binary Search ends.

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