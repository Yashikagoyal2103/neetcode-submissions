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
    private int rev=0, ans=0;
    public int kthSmallest(TreeNode root, int k) {
        InTraverse(root, k);
        return ans;
    }
    public void InTraverse(TreeNode root, int k){
        if (root == null){
            return;
        }
        InTraverse(root.left, k);
        rev++;
        if(rev == k){
            ans=root.val;
            return;
        } 
        InTraverse(root.right, k);
    }
}