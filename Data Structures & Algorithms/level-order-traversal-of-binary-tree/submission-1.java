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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        level(root, l, 0);
        return l;
    }
    public void level(TreeNode root,List<List<Integer>> l, int d ){
        if(root == null) return ;
        
        if(l.size() == d ){
            l.add(new ArrayList<>());
        }
        l.get(d).add(root.val);
        level(root.left, l, d+1);
        level(root.right, l, d+1);
    }
}