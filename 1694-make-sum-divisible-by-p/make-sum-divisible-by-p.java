class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for(int i:nums) total += i;

        long trgt = total %p;
        if(trgt==0) return  0;

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);

        long pre = 0;
        int res = nums.length;

        for(int i=0;i<nums.length;i++){
            pre = (pre+nums[i])%p;
            int need = (int)((pre-trgt+p)%p);
            if(mp.containsKey(need)){
                res = Math.min(res,i-mp.get(need));
            }
            mp.put((int)pre,i);
        }
        return res == nums.length?-1:res;
    }
}