class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        long goodPairs =0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int key = nums[i] - i;
            goodPairs+=map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        long totalPairs = (long) n *(n-1)/2;
        return totalPairs - goodPairs;
    }
}