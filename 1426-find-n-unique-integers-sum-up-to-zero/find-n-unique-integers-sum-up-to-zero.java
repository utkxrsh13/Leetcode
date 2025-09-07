class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int res = 0;
        for(int i=1;i<=n/2;i++){
            arr[res++] = i;
            arr[res++] = -i;
        }
        if(n%2!=0) arr[res] = 0;
        return arr;
    }
}