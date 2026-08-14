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
    private int i;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        StringBuilder str=new StringBuilder();
        serial(root, str);
        return str.toString();
    }
    private void serial(TreeNode root, StringBuilder str){
        if(root == null){
            str.append("null,");
            return;
        }
        str.append(root.val).append(",");
        serial(root.left, str);
        serial(root.right, str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s= data.split(",");
        if(s[0].equals("null")) return null;
        i=0;
        return deserial(s);
    }
    private TreeNode deserial(String[] s){
        if(s[i].equals("null")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s[i]));
        i++;

        root.left = deserial(s);
        root.right = deserial(s);

        return root;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
