class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        char prev = word.charAt(0);
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==prev){
                count++;
            }else{
                prev = word.charAt(i);
            }
        }
        return count+1;
    }
}