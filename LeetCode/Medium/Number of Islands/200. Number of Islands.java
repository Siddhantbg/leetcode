// 200. Number of Islands [Medium]
// https://leetcode.com/problems/number-of-islands/
// Language: java | Runtime: 3 ms | Memory: 51.9 MB
// Pattern: DFS
// Tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
// Synced: 2026-11-19

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null|| grid.length==0) return 0;
        // Java checks left-to-right, so `grid.length` throws a `NullPointerException` before it ever reaches `grid == null`
        int r=grid.length;//row
        int count=0;
        int c=grid[0].length; //col
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        if(grid[i][j]=='1'){
            count++;
            dfs(grid,i,j);
        }
    }
}
        return count;
    }

    public void dfs(char[][]grid,int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }

        grid[r][c]='0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}