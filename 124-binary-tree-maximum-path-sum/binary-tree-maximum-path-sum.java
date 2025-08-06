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
    private int findMaxPathSum(TreeNode root, int[] max){
        if(root==null){
            return 0;
        }
        int left = Math.max(0,findMaxPathSum(root.left,max));
        int right = Math.max(0, findMaxPathSum(root.right, max));
        max[0] = Math.max(max[0], root.val+left+right);
        return root.val+ Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        findMaxPathSum(root, max);
        return max[0];
    }
}