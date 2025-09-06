class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k=1;k<=60;k++){
            long rem =(long) num1-(long) k*num2;
            if(rem< k) continue;
            if(Long.bitCount(rem)<=k){
                return k;
            }
        }
        return -1;
    }
}