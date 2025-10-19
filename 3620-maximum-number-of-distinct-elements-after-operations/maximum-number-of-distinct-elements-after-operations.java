class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int prev = (int)-1e9;
        for(int n:nums){
            int l = Math.max(n-k, prev+1);
            if(l<=n+k){
                prev =l;
                ans++;
            }
        }
        return ans;
    }
}