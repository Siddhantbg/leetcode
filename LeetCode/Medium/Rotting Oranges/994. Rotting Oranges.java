// 994. Rotting Oranges [Medium]
// https://leetcode.com/problems/rotting-oranges/
// Language: java | Runtime: 2 ms | Memory: 44 MB
// Space: O(n) (auto-detected)
// Pattern: BFS
// Tags: Array, Breadth-First Search, Matrix
// Synced: 2026-11-20

//same level guys 
//bfs same level
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Step 2: scan once
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 2) q.offer(new int[]{r, c});
                if (grid[r][c] == 1) fresh++;
            }
        }

        // Step 3: nothing to rot
        if (fresh == 0) return 0;

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int mins = 0;

        // Step 4: BFS, one minute per round
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();                 // freeze this minute's oranges
            for (int i = 0; i < size; i++) {
                int[] a = q.poll();
                int r = a[0];
                int c = a[1];

                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;        // rot it (also marks visited)
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            mins++;                              // one full round = 1 minute
        }

        // Step 5: anything left fresh could never be reached
        if(fresh>0){
            return -1;
        }
        return mins;
    }
}