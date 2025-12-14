class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int small =0;
        int large = 0;
        for(int i=0;i<k;i++){
            small += nums[i];
            large += nums[n-i];
        }
        return Math.abs(small-large);
    }
}