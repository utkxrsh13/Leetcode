class Solution {
    public String[] createGrid(int m, int n) {
        List<String> res = new ArrayList<>();
        for(int i= 0;i<m-1;i++){
            res.add("." + "#".repeat(n - 1));
        }
        res.add(".".repeat(n));
        return res.toArray(new String[0]);
    }
}