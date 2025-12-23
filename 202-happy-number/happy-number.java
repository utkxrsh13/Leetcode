class Solution {
    public boolean isHappy(int n) {
        if(n ==1 || n == 7){
            return true;
        }else if(n<10) return false;

        Set<Integer> st = new HashSet<>();
        while(n!=1){
            if(st.contains(n)) return false;
            st.add(n);
            n = square(n);
        }
        return true;
    }
    private int square(int n ){
        int res =0;
        while(n>0){
            int temp =n%10;
            res += temp*temp;
            n/=10;
        }
        return res;
    }
}