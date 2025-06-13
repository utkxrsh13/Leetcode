class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> paren = new Stack<>();
        paren.push(-1);
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                paren.push(i);
            }else{
                paren.pop();
                if(paren.isEmpty()){
                    paren.push(i);
                }else{
                    maxlen = Math.max(maxlen, i-paren.peek());
                }
            }
        }
        return maxlen;
    }
}