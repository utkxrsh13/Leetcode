class Solution {
    public String largestGoodInteger(String num) {
        String sub = "";
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                sub = sub.compareTo(num.substring(i,i+3))>0? sub: num.substring(i,i+3);
            }
        }
        return sub;
    }
}