class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int n:arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getKey() == entry.getValue()){
                max = Math.max(max,entry.getKey());
            }
        }
        return max;
    }
}