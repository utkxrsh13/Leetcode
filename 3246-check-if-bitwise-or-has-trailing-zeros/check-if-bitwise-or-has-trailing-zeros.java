class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n =  nums.length;
    	int even = 0;
    	for(int i=0;i<n;i++){
			
    		if(nums[i] % 2==0){
    			even++;
    		}
		}	
    	return even >= 2;
    }
}