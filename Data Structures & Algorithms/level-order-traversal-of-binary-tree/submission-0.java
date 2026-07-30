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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        // If root is null
        if(root == null) return l;
        l.add(new ArrayList<>());
        int i=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            if(temp == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    l.add(new ArrayList<>());
                    i++;
                }
            }else{
                l.get(i).add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return l;
    }
}
