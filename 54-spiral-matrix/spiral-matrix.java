class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int top =0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while(top<= bottom && left<=right){
            //top row from left to right
            for(int i = left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            //right col from top to bottom
            for(int i = top ;i<= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            //bottom row from right to left
            if(top<= bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left col from bottom to top 
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}