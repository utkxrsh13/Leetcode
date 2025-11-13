class Solution {
    public int maxOperations(String s) {
        int oneCount =0;
        int res =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                oneCount++;
            }else if(i>0 && s.charAt(i-1)=='1'){
                res+= oneCount;
            }
        }
        return res;
    }
}