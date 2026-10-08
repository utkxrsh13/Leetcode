class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> paren = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(paren.size()>0){
                    str.append(s.charAt(i));
                }
                paren.push(s.charAt(i));
            }else{
                paren.pop();
                if(paren.size()>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}