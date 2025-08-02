class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int a:basket1){
            freq.put(a, freq.getOrDefault(a,0)+1);
        }
        for(int b:basket2){
            freq.put(b,freq.getOrDefault(b,0)-1);
        }
        List<Integer> excess = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            int val = entry.getKey();
            int count = entry.getValue();
            minVal= Math.min(minVal,val);
            if(count%2!=0) return -1;

            for (int i = 0; i < Math.abs(count) / 2; i++) {
                excess.add(val); // doesn't matter which side, we sort below
            }
        }
        Collections.sort(excess);
        long cost = 0;
        for (int i = 0; i < excess.size() / 2; i++) {
            cost += Math.min(excess.get(i), 2 * minVal);
        }
        
        return cost;
    }
}