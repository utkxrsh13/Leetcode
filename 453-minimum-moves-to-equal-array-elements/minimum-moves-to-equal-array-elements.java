class Solution {
    public int minMoves(int[] nums) {
        int a=0;
        int min = Integer.MAX_VALUE ;
        for(int n: nums){
            min = Math.min(min,n);
        }  
        for(int n : nums){
            a+=n-min;
        }
        return a;
    }
}