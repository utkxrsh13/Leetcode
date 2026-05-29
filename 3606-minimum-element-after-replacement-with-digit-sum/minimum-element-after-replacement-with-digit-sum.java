class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        
        for(int num: nums){
            int currSum= 0;
            while(num>0){
                currSum += num%10;
                num /= 10;
            }
            min = Math.min(min, currSum);
        }
        
        return min;
    }
}