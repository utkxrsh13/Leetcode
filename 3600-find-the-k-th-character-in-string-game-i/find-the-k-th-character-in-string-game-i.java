class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");
        int n=1;
        while(n<k){
            n = s.length();
            for(int i =0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='z'){
                    s.append('a');
                }else{
                    s.append((char) (ch+1));
                }
            }
        }
        return s.charAt(k-1);
    }
}