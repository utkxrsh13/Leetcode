class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder string = new StringBuilder(s);
        while(string.indexOf(part)!= -1){
            int index = string.indexOf(part);
            string.delete(index, index + part.length());
        }
        return string.toString();
    }
}