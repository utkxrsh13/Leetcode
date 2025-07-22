class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int currSum =0;
        int res =0;
        int left =0;
        Set<Integer> s =new HashSet<>();

        for(int i =0;i<nums.length;i++){
            while(s.contains(nums[i])){
                s.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            currSum += nums[i];
            s.add(nums[i]);
            res = Math.max(res, currSum);
        }
        return res;
    }
}