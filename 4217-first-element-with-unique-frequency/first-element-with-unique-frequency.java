class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> a = new HashMap<>();
        for(int i: nums){
            a.put(i, a.getOrDefault(i,0)+1);
        }

        Map<Integer, Integer> b = new HashMap<>();
        for(int i: a.values()){
            b.put(i, b.getOrDefault(i,0)+1);
        }

        for(int i: nums){
            if(b.get(a.get(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}