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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1, postorder, 0, postorder.length-1);
    }
    private TreeNode helper(int[] inorder, int inorderS, int inorderE,int[] postorder, int postorderS,int postorderE){
        if(inorderS > inorderE || postorderS > postorderE){
            return null;
        }

        int rootval = postorder[postorderE];
        TreeNode root = new TreeNode(rootval);

        int rootInd = 0;
        for(int i=inorderS;i<= inorderE;i++){
            if(inorder[i] == rootval){
                rootInd = i;
                break;
            }
        } 

        int leftSize = rootInd - inorderS;
        int rightSize = inorderE - rootInd;
        root.left = helper(inorder, inorderS,rootInd-1,postorder, postorderS,postorderS+leftSize-1);
        root.right = helper(inorder, rootInd+1,inorderE,postorder, postorderE-rightSize, postorderE-1);

       return root;
    }
}