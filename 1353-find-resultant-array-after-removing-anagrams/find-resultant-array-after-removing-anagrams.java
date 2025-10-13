class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i<words.length;i++){
            char[] a = words[i].toCharArray();
            char[] b = res.get(res.size()-1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(!Arrays.equals(a,b)){
                res.add(words[i]);
            }
        }
        return res;
    }
}