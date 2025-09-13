class Solution {
    private boolean helper(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int cons =0,vow =0;
        for(char c:s.toCharArray()){
            int ind = c-'a';
            freq[ind]++;
            if(helper(c)){
                vow = Math.max(vow, freq[ind]);
            }else{
                cons = Math.max(cons, freq[ind]);
            }
        }
        return cons+vow;

    }
}