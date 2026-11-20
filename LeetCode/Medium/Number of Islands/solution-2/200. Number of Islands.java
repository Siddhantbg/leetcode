// 200. Number of Islands [Medium]
// https://leetcode.com/problems/number-of-islands/
// Language: java | Runtime: 3 ms | Memory: 51.9 MB
// Pattern: DFS
// Tags: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
// Synced: 2026-11-20

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }

        int m=grid.length;
        int n=grid[0].length;
        int co=0;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]=='1'){
                    co++;
                    dfs(grid,r,c);
                }
            }
        }
        return co;
    }

    private void dfs(char[] []grid,int r,int c){
        if(c<0 || r<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}