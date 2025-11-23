class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[] dp = new int[]{0,Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int num:nums){
            int[] temp = dp.clone();
            int rem = num%3;

            for(int j=0;j<3;j++){
                if(temp[j]!= Integer.MIN_VALUE){
                    int newRem = (j+rem)%3;
                    dp[newRem] = Math.max(dp[newRem], temp[j]+num);
                }
            }
        }
        return dp[0];
    }
}