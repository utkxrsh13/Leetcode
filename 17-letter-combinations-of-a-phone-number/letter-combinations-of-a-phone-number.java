class Solution {
    private static final String[] Keypad = {
        "",    "",    "abc", "def", "ghi", "jkl", 
        "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() ==0) return res;
        backtrack(res, new StringBuilder(), digits,0);
        return res;
    }
    private void backtrack(List<String> res, StringBuilder curr, String digits, int ind){
        if (ind == digits.length()){
            res.add(curr.toString());
            return;
        }
        String letters = Keypad[digits.charAt(ind)-'0'];

        for(char c: letters.toCharArray()){
            curr.append(c);
            backtrack(res, curr,digits, ind+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}