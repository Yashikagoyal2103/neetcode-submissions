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
    private int i=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root == null) return arr;
        rightView(root, arr, 0);
        return arr;
    }
    public void rightView(TreeNode root, List<Integer> arr, int l){
        if( root == null) return;
        
        if(i==l){
            arr.add(i, root.val);
            i++;
        }
        rightView(root.right, arr, l+1);
        rightView(root.left, arr, l+1);
    }
}
