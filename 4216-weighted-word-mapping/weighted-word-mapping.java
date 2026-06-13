class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String w : words){
            int sum = 0;
            for (char c : w.toCharArray()) {
                sum += weights[c - 'a'];
            }
            int mod = sum % 26;
            char mapped = (char) ('z' - mod);
            res.append(mapped);
        }
        return res.toString();
    }
}