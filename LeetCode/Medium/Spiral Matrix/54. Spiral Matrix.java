// 54. Spiral Matrix [Medium]
// https://leetcode.com/problems/spiral-matrix/
// Language: java | Runtime: 0 ms | Memory: 42.7 MB
// Space: O(n) (auto-detected)
// Pattern: Two pointers + Reverse traversal
// Tags: Array, Matrix, Simulation
// Synced: 2026-10-26

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        // left to right
        // top to bottom
        // right to left
        // bottom to top
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        List<Integer> map=new ArrayList<>();
        
        while(top<=bottom && left<=right){
        for(int j=left;j<=right;j++){
            map.add(matrix[top][j]);                 
        }
        top++;

        for(int i=top;i<=bottom;i++){
            map.add(matrix[i][right]);                 
        }
        right--;

// Aman: Abe bhai, do alag sawaal hain yahan! 😂
// - top <= bottom poochta hai: kya bottom row abhi bachi hai?
// - right >= left poochta hai: kya us row mein columns bache hain?

        if(top<=bottom){
        for(int j=right;j>=left;j--){
            map.add(matrix[bottom][j]);                 
        }
        bottom--;
        }

        if(left<=right){
        for(int i=bottom;i>=top;i--){
            map.add(matrix[i][left]);                 
        }
        left++;
        }
        }
        return map;
    }
}