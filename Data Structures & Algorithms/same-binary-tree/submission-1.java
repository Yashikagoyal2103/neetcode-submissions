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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> arrp= new ArrayList<>();
        List<Integer> arrq= new ArrayList<>();
        BuildPreOrder(arrp, p);
        BuildPreOrder(arrq, q);
        return arrp.equals(arrq);
    }
    public void BuildPreOrder(List<Integer> arr,TreeNode node){
        if(node == null){
            arr.add(null);
            return;
        }
        arr.add(node.val);
        BuildPreOrder(arr, node.left);
        BuildPreOrder(arr, node.right);
    }
}
