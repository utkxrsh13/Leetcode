class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long prefixSum = 0;
        long maxSum = Long.MIN_VALUE;
        long[] kSum = new long[k];
        for(int i =0;i<k;i++){
            kSum[i] = Long.MAX_VALUE/2;
        }
        kSum[k-1] = 0;

        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int rem = i%k;
            if(kSum[rem]!= Long.MAX_VALUE/2){
                maxSum = Math.max(maxSum, prefixSum-kSum[rem]);
            }
            kSum[rem] = Math.min(kSum[rem], prefixSum);
        }
        return (maxSum==Long.MIN_VALUE)?0:maxSum;
    }
}