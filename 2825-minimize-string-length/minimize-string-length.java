class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        int count=1;
        for(int i=1;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                count++;
            }
            set.add(s.charAt(i));
        }
        return count;
    }
}