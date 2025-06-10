class Solution {
    public int maxDifference(String s) {
        int maxSum =0;
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        Map<Character,Integer> m = new HashMap<>(); 
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int[] f = new int[m.size()];
        int ind = 0;
        for(int frq: m.values()){
            f[ind++] = frq;
        }
        for (int i = 0; i < f.length; i++) {
            int freq = f[i];
            if (freq % 2 == 0) {
                
                if (freq < minEven) {
                    minEven = freq;
                }
            } else {
                
                if (freq > maxOdd) {
                    maxOdd = freq;
                }
            }
        }
        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
            return 0; 
        }

        return maxOdd - minEven;
    }
}