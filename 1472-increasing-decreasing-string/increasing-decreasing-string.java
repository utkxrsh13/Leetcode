class Solution {
    public String sortString(String s) {
        StringBuilder result = new StringBuilder();
        int[] freqArray = new int[26];
        for(char ch :s.toCharArray()){ 
            freqArray[ch-'a']++;
        }

        while(result.length() < s.length()){
            for(int i = 0;i < 26;i++) {
                if(freqArray[i] > 0){
                    result.append((char)(i + 'a'));
                    freqArray[i] -= 1;
                }
            }

            for(int i = 25;i >= 0;i--){
                if(freqArray[i] > 0){
                    result.append((char)(i + 'a'));
                    freqArray[i] -= 1;
                }
            }
        }

        return result.toString();
    }
}