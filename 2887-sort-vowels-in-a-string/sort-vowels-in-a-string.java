class Solution {
    private boolean helper(char ch){
        return "AEIOUaeiou".indexOf(ch) !=-1;
        
    }
    public String sortVowels(String s) {
        List<Character> arr = new ArrayList<>();
        int a =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(helper(ch)){
                    arr.add(ch);
                }
        }
        a=0;
        Collections.sort(arr);
        StringBuilder st = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(helper(ch)){
                st.append(arr.get(a++));
            }else{
                st.append(ch);
            }
        }
        return st.toString();
    }
}