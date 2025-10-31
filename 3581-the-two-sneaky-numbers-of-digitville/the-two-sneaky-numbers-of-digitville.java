class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int a:nums){
            mp.put(a, mp.getOrDefault(a,0)+1);
        }
        int[] res = new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            if(m.getValue()%2==0){
                res[i++] = m.getKey();
            }
        }
        return res;
    }
}