// 662. Maximum Width of Binary Tree [Medium]
// https://leetcode.com/problems/maximum-width-of-binary-tree/
// Language: java | Runtime: 2 ms | Memory: 44.7 MB
// Time:  O(n)
// Space: O(n) (auto-detected)
// Pattern: BFS
// Synced: 2026-11-22

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
        q.offer(new Pair(root,0));
        int ans=0;

        while(!q.isEmpty()){
            int size=q.size();
            long mmin=q.peek().idx; // to make id start from 0
            long first=0;
            long last=0;

            for(int i=0;i<size;i++){
                long cur_id=q.peek().idx-mmin;
                TreeNode node=q.peek().node;
                q.poll();

                if(i==0) first=cur_id;
                if(i==size-1) last=cur_id;

                if(node.left!=null) q.offer(new Pair(node.left,cur_id*2+1));
                if(node.right!=null) q.offer(new Pair(node.right,cur_id*2+2));
            }
            ans=Math.max(ans,(int)(last-first+1));
        }
        return ans;
    }
}