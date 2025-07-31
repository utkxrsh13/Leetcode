class Solution {
    public int nextGreaterElement(int n) {
        char[] dig = Integer.toString(n).toCharArray();
        int i= dig.length-2;
        while(i>=0 && dig[i]>=dig[i+1]){
            i--;
        }
        if(i==-1) return -1;
        int j=dig.length-1;
        while(dig[j]<=dig[i]){
            j--;
        }
        swap(dig,i,j);
        reverse(dig,i+1,dig.length-1);
        long val = Long.parseLong(new String(dig));
        return (val<=Integer.MAX_VALUE)?(int)val:-1;
    }
    private void swap(char[] arr, int i,int j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    private void reverse(char[] arr,int i, int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}