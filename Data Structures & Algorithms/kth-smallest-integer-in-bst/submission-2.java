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
        Stack<TreeNode> s=new Stack<>();
        TreeNode temp=root;
        int count=k;
        while(!s.isEmpty() || temp != null){
            while(temp!= null){
                s.push(temp);
                temp=temp.left;
            }
            temp=s.pop();
            count--;
            if(count == 0) return temp.val;
            temp=temp.right;
        }
        return -1;
    }
}
