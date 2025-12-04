class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int sum=1;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(count);
                count=0;
            }else{
                count = st.pop()+ Math.max(2*count, 1);
            }
        }
        return count;
    }
}