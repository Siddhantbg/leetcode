// 543. Diameter of Binary Tree [Easy]
// https://leetcode.com/problems/diameter-of-binary-tree/
// Language: java | Runtime: 1 ms | Memory: 47.3 MB
// Time:  O(n)
// Space: O(h)
// Pattern: DFS
// Synced: 2026-11-21

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
private int result=0;
    private int solve(TreeNode root){
        if(root==null){
                return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);

        result=Math.max(result,left+right);
        //+1 coz of last edge
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {

        solve(root);

            return result;

    }

}

// Kyunki Java mein `int` **copy** hoke jaata hai (pass by value). `solve` ko `result` ki ek photocopy milti hai. Andar tum photocopy badalte ho, lekin original kaagaz waise ka waisa rehta hai.