// 662. Maximum Width of Binary Tree [Medium]
// https://leetcode.com/problems/maximum-width-of-binary-tree/
// Language: java | Runtime: 1 ms | Memory: 44.7 MB
// Space: O(n) (auto-detected)
// Pattern: BFS
// Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Synced: 2026-11-23

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
    class Pair{
        TreeNode node;
        long idx;
        Pair(TreeNode node,long idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;


        while(!q.isEmpty()){
            int size=q.size();
            long mmin=q.peek().idx;

            long first=0;
            long last=0;

            for(int i=0;i<size;i++){
                Pair p=q.poll();
                long cur_id=p.idx-mmin;
                TreeNode node=p.node;
                

                if(i==0){       
                    first=cur_id;
                }
                if(i==size-1){
                    last=cur_id;
                }

                if(node.left!=null){
                    q.add(new Pair(node.left,2*cur_id+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,2*cur_id+2));
                }
            }
            ans=Math.max(ans,(int)(last-first+1));
        }
        return ans;
    }
}