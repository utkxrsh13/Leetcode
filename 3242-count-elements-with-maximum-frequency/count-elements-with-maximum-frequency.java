class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int n:nums){
            freq[n]++;
        }
        int max = 0;
        for(int n:freq){
            max = Math.max(n,max);
        }
        int res =0;
        for(int n:freq){
            if(n==max){
                res+=n;
            }
        }
        return res;
    }
}