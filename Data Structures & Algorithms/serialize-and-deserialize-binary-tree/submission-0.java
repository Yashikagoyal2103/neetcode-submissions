/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node == null){
                str.append("null,");
                continue;
            }
            str.append(node.val).append(",");
            q.offer(node.left);
            q.offer(node.right);
        }
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s= data.split(",");
        if(s[0].equals("null")) return null;
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        q.offer(root);
        int i=1;
        while(!q.isEmpty()&& i < s.length){
            TreeNode node=q.poll();
            if(!s[i].equals("null")){
                node.left=new TreeNode(Integer.parseInt(s[i]));
                q.offer(node.left);
            }
            i++;
            if(!s[i].equals("null")){
                node.right=new TreeNode(Integer.parseInt(s[i]));
                q.offer(node.right);
            }
            i++;
        } 
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
