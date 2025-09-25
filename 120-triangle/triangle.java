class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            for(int col =0;col<triangle.get(i).size();col++){
                int a = triangle.get(i+1).get(col);
                int b = triangle.get(i+1).get(col+1);
                int ans = triangle.get(i).get(col)+ Math.min(a,b);
                triangle.get(i).set(col,ans);
            }
        }
        return triangle.get(0).get(0);
    }
}