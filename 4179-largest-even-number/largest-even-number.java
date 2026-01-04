class Solution {
    public String largestEven(String s) {
        int a=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '2'){
                a=i;
                break;
            }
        }
        return s.substring(0,a+1);
    }
}