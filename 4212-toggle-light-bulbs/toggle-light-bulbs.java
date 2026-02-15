class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res = new ArrayList<>();
        int[] freq = new int[101];

        for(int i: bulbs){
            freq[i]++;
        }

        for(int i = 0;i < freq.length;i++){
            if(freq[i]>0 && freq[i]%2 != 0){
                res.add(i);
            }
        }
        return res;
    }
}