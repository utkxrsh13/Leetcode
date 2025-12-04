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
    public int pathSum(TreeNode root, int targetSum) {
         Map<Long, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0L, 1);  // Base case to count paths starting at root
        return dfs(root, 0, targetSum, prefixMap);
    }

    private int dfs(TreeNode node, long currSum, int target, Map<Long, Integer> map) {
        if (node == null) return 0;

        currSum += node.val;

        // Check if there exists a prefix sum that leads to a valid path
        int count = map.getOrDefault(currSum - target, 0);

        // Add current prefix sum to map
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        // Explore children
        count += dfs(node.left, currSum, target, map);
        count += dfs(node.right, currSum, target, map);

        // Backtrack
        map.put(currSum, map.get(currSum) - 1);

        return count;
    }
}