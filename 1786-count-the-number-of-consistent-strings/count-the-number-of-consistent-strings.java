class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            s.add(allowed.charAt(i));
        }
        int c =0;
        for(String st: words){
            int flag=1;
            for(int i=0;i<st.length();i++){
                if(!s.contains(st.charAt(i))){
                    flag =0;
                    break;
                }
            }
            c+= flag;
        }
        return c;
    }
}