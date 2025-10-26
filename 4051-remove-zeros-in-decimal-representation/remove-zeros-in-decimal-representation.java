class Solution {
    public long removeZeros(long n) {
        String res = "";
        String s = Long.toString(n);
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                res+= s.charAt(i);
            }
        }
        return Long.parseLong(res);
    }
}