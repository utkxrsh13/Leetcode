class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String curr = strs[0];
        int currLen = curr.length();
        for(int i=0;i<strs.length;i++){
            String sb = strs[i];
            while(currLen>sb.length() || !curr.equals(sb.substring(0,currLen))){
                currLen--;
                if(currLen==0){
                    return "";
                }
                curr = curr.substring(0,currLen);
            }
        }
        return curr;
    }
}