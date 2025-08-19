class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long sub = 0;
        for(int num:nums){
            sub = (num == 0) ? sub + 1:0;
            ans += sub;
        }
        return ans;
    }
}