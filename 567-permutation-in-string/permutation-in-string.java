class Solution {
    private String sorting(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public boolean checkInclusion(String s1, String s2) {
        int n= s1.length();
        int m = s2.length();
        if(n>m) return false;
        String new1 = sorting(s1);
        for(int i=0;i<=m-n;i++){
            String subStr = s2.substring(i,i+n);
            String newS2 = sorting(subStr);
        if(newS2.equals(new1)) return true;
        }
        return false;
    }
}