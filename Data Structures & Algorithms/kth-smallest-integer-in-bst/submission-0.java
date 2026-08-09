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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder= new ArrayList<>();
        InTraverse(root, inorder);
        return inorder.get(k-1);
    }
    public void InTraverse(TreeNode root, List<Integer> l){
        if (root == null) return ;
        InTraverse(root.left, l);
        l.add(root.val);
        InTraverse(root.right, l);
    }
}
