class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        for(int i=nums.length-1;i>=2;i--){
            int left = 0;
            int j = i-1;
            while(left<j){
                if(nums[left]+nums[j]>nums[i]){
                    ans+=(j-left);
                    j--;
                }else left++;
            }
        }
        return ans;
    }
}