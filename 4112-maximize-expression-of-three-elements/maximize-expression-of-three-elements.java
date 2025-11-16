class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int ans =0;
        Arrays.sort(nums);
        int a = nums[nums.length-1]+nums[nums.length-2];
        ans = a-(nums[0]);
        return ans;

    }
}