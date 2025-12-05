class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        int ans =0,count=0;
        for(int i=0;i<nums.length;i++){
            total+= nums[i];
        }
        int left = 0, right=0;
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            right = total-left;
            ans = Math.abs(right - left);
            if(ans%2==0){
                count++;
            }
        }
        return count==0?0:count-1;
    }
}