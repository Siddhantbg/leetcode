// 994. Rotting Oranges [Medium]
// https://leetcode.com/problems/rotting-oranges/
// Language: java | Runtime: 3 ms | Memory: 43.8 MB
// Space: O(n) (auto-detected)
// Pattern: BFS
// Tags: Array, Breadth-First Search, Matrix
// Synced: 2026-11-20

//same level guys 
//bfs same level
class Solution {
    public int orangesRotting(int[][] grid) {
    Queue<int[]> q=new LinkedList<>();
    int m=grid.length;
    int n=grid[0].length;
int fresh=0;
      for(int r=0;r<m;r++){
        for(int c=0;c<n;c++){
            if(grid[r][c]==1){
                fresh++;
            }
            if(grid[r][c]==2){
                q.offer(new int[]{r,c});
            }
        }
      }

      if(fresh==0){
        return 0;
      }

      int mins=0;
      int dirs[][]={{1,0},{-1,0},{0,-1},{0,1}};

        while(!q.isEmpty()  && fresh>0){
            int size=q.size();

            for(int i=0;i<size;i++){
 int a[]=q.poll();
            int r=a[0];
            int c=a[1];

            for(int d[]:dirs){
                int nr=r+d[0];
                int nc=c+d[1];

                if(nc<n && nr<m && nr>=0 && nc>=0 && grid[nr][nc]==1){
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