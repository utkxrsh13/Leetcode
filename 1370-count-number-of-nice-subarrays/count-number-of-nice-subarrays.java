class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]%2;
        }
        int[] pre = new int[nums.length+1];
        pre[0] =1;
        int ans =0;
        int sum =0;
        for(int n:nums){
            sum += n;
            if(sum>=k){
                ans += pre[sum - k];
            }
            pre[sum] += 1;
        }
        return ans;
    }
}