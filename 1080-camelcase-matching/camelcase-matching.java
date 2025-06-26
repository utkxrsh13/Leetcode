class Solution {
    private boolean isMatch(String query, String pattern){
        int j=0;
        for(int i=0;i<query.length();i++){
            char c = query.charAt(i);
            if(j<pattern.length() && c == pattern.charAt(j)){
                j++;
            }else if(Character.isUpperCase(c)){
                return false;
            }
        }
        return j== pattern.length();
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        for(String q:queries){
            res.add(isMatch(q,pattern));
        }
        return res;
    }
}