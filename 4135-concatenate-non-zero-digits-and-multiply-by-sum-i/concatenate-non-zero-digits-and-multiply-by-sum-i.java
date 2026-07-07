class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
        long rev = 0, temp = n;
        while(temp > 0){
            rev = rev*10+temp%10;
            temp /= 10;
        }
        long x = 0;
        long digitSum = 0;

        while(rev > 0){
            long d = rev%10;
            if (d!=0) {
                x=x*10+d;
                digitSum += d;
            }
            rev /= 10;
        }

        return x*digitSum;
    }
}