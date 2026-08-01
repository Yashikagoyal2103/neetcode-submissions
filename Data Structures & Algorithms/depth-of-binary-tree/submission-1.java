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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int max=1;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    max++;
                }
            }else{
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return max;
    }
}
