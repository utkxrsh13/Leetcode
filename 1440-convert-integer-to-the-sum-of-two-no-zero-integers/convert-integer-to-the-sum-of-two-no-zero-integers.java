class Solution {
    public int[] getNoZeroIntegers(int n) {
        // int[] ans = new int[2];
        for(int i =1;i<=n-1;i++){
            int j = n-i;
            if(helper(i) && helper(j)){
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    private boolean helper(int n){
        return !String.valueOf(n).contains("0");
    }
}