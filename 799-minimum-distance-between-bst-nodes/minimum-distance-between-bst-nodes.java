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
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
    private void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        if(prev != null){
            minDiff = Math.min(minDiff, node.val-prev);
        }
        prev = node.val;
        inOrder(node.right);
    }
}