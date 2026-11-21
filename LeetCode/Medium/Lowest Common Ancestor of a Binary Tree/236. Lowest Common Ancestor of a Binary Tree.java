// 236. Lowest Common Ancestor of a Binary Tree [Medium]
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Language: java | Runtime: 18 ms | Memory: 70.2 MB
// Pattern: DFS
// Tags: Tree, Depth-First Search, Binary Tree, Binary Lifting, Lowest Common Ancestor
// Synced: 2026-11-21

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null || root==p || root==q){
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);

        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null){
        return root;
        }   
        else if(left!=null && right==null){
            return left;
        }
           return right;
        

    }
}