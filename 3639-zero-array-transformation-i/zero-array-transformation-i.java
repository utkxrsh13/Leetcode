class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] dif = new int[n + 1];

        for(var q :queries){
            dif[q[0]]++;
            dif[q[1]+1]--;
        }

        for(int i = 0;i < n;i++){
            dif[i + 1] += dif[i];
        }

        for(int i = 0;i < n;i++){
            if(dif[i] == nums[i])
                continue;
            if(nums[i] == 0) 
                continue;
            if(dif[i] > nums[i])                 
                continue;
            if(dif[i] < nums[i]) 
                return false;
        }

        return true;
    }
}