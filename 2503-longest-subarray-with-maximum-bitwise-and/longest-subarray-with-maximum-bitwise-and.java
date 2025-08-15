class Solution {
    public int longestSubarray(int[] nums) {
        int maxAnd = 0;
        
        // Step 1: Find max bitwise AND possible (which is the max number itself)
        for (int num : nums) {
            maxAnd = Math.max(maxAnd, num);
        }

        int longest = 0;
        int currentLen = 0;

        // Step 2: Traverse and simulate ANDs
        for (int num : nums) {
            if (num == maxAnd) {
                currentLen++;
                longest = Math.max(longest, currentLen);
            } else {
                currentLen = 0;
            }
        }

        return longest;
    }
}