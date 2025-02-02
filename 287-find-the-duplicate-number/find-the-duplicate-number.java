class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int n: nums){
            if(hash.contains(n)){
                return n;
            }
            hash.add(n);
        }
        return nums.length;
    }
}