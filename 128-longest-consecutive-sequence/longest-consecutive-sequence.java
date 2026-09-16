class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> consct = new HashSet<>();
        for(int n: nums){
            consct.add(n);
        }
        int longest = 0;
        for(int n: consct){
            if(!consct.contains(n-1)){
                int l = 1;
                while(consct.contains(n+l)){
                    l++;
                }
                longest = Math.max(longest, l);
            }
        }
        return longest;
    }
}