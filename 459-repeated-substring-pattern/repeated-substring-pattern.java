class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String c = s+s;
        return c.substring(1,c.length()-1).contains(s);
    }
}