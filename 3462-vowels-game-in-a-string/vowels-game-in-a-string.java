class Solution {
    private boolean helper(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public boolean doesAliceWin(String s) {
        int count =0;
        for(char c: s.toCharArray()){
            if(helper(c)){
                count++;
            }
        }
        return count>=1?true:false;
    }
}