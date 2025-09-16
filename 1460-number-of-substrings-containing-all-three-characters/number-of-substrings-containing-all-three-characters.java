class Solution {
    public int numberOfSubstrings(String s) {
        int res =0;
        int n = s.length();
        int count[] = new int[3];
        int j=0;
        for(int i=0;i<n;i++){
            while(j<n && (count[0]==0 || count[1]==0 || count[2]==0)){
                count[s.charAt(j)-'a']++;
                j++;
            }
            if(count[0]>0 && count[1]>0 && count[2]>0){
                res+=(n-j+1);
            }
            count[s.charAt(i)-'a']--;
        }
        return res;
    }
}