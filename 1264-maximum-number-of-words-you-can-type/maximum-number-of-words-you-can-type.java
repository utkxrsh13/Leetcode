class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans =0;
        Set<Character> st = new HashSet<>();
        for(char c :brokenLetters.toCharArray() ){
            st.add(c);
        }
        boolean keys = false;
        for(int i=0;i<=text.length();i++){
            if(i<text.length() && st.contains(text.charAt(i))){
                keys = true;
            }
            if(i==text.length() || text.charAt(i)==' ' ){
                if(!keys) ans++;
                keys = false;
            }
        }
        return ans;
    }
}