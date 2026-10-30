class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chr = new HashSet<>();
        int result = 0, length = 0;
        for(int i = 0;i < s.length();i++){
            while(chr.contains(s.charAt(i))){
                chr.remove(s.charAt(length));
                length++;
            }
            chr.add(s.charAt(i));
            result = Math.max(result, i-length + 1);
        }
        return result;
    }
}