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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root = insert(root,preorder[i]);
        }
        return root;
    }
    private TreeNode insert(TreeNode root, int x){
        if(root == null) return new TreeNode(x);

        if(x < root.val) root.left = insert(root.left, x);
        else root.right = insert(root.right,x);

        return root;
    }
}