// 994. Rotting Oranges [Medium]
// https://leetcode.com/problems/rotting-oranges/
// Language: java | Runtime: 2 ms | Memory: 43.3 MB
// Space: O(n) (auto-detected)
// Pattern: BFS
// Tags: Array, Breadth-First Search, Matrix
// Synced: 2026-11-22

class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
Queue<int[]> q=new LinkedList<>();
int fresh=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==1){
                    fresh++;        
                }
                else if(grid[r][c]==2){
                    q.offer(new int[]{r,c});
                }
            }
        }

        if(fresh==0){
            return 0;
        }
            int mins=0;
            int dirs[][]={{1,0},{0,1},{-1,0},{0,-1}};

        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int a[]=q.poll();
                int r=a[0];
                int c=a[1];

            for(int d[]:dirs){
                int nr=r+d[0];
                int nc=c+d[1];

                if(nr<grid.length && nc<grid[0].length && nc>=0 && nr>=0 && grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    fresh--;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
            mins++;
        }
        if(fresh>0){
            return -1;
        }
        return mins;
    }
}