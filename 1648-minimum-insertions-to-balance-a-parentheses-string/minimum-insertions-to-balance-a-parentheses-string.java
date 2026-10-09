class Solution {
    public int minInsertions(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    if (i != s.length() - 1 && s.charAt(i+1) == ')') {
                        count++;
                        i++;
                    }else count+=2;
                }else{
                    if(i!=s.length()-1 && s.charAt(i+1) == ')'){
                        st.pop();
                        i++;
                    }else{
                        count+=1;
                        st.pop();
                    }
                }
            }
        }
        return count+st.size()*2;
    }
}