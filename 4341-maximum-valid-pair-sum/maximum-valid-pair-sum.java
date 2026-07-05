class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=nums[0];
        int res=0;
        for(int i=k;i<nums.length;i++){
            max=Math.max(max,nums[i-k]);
            res=Math.max(res,max+nums[i]);
        }
        return res;
    }
}