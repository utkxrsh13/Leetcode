class Solution {
    private int reverse(int n){
        int rem = 0;
        while(n>0){
            rem = rem*10+(n%10);
            n/=10;
        }
        return rem;
    }
    public int mirrorDistance(int n) {
        int a = reverse(n);
        return Math.abs(a-n);
    }
}