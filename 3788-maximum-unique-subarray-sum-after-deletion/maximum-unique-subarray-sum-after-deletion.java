class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            if(!s.contains(i)){
                if(i>0){
                    sum+= i;
                }else max = Math.max(max,i);
            }
            s.add(i);
        }
        if(sum==0 && !s.contains(0)){
            return max;
        }
        return sum;
    }
}