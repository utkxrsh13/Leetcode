class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> ts = new Stack<>();

        for(char c:s.toCharArray()){
            if(c!='#') {
                st.push(c);  
            }else if(!st.isEmpty()){
                st.pop();
            }
        }

        for(char c:t.toCharArray()){
            if(c!='#') {
                ts.push(c);  
            }else if(!ts.isEmpty()){
                ts.pop(); 
            }
        }
        return st.equals(ts);
    }
}