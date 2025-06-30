class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            while(nums[j]-nums[i] > 1){
                i++;
            }
            if(nums[j]-nums[i] == 1){
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}