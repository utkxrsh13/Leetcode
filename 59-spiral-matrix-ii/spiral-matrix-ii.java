class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left = 0;
        int right = mat[0].length-1;
        int top = 0;
        int bottom = mat.length-1;
        int count =1;
        int size = mat.length * mat[0].length;
        while(count<=size){
            for( int i=left; i<=right && count<=size; i++){
                mat[top][i]=count++;
            }
            top ++;
            for( int i=top; i<=bottom && count<=size;i++){
                 mat[i][right]= count++;
              
            }
            right --;
            // right to left 
            for(int i=right; i>=left && count<=size;i--){
                mat[bottom][i]= count++;
                
            }
            bottom --;
            // bottom to top 
            for(int i=bottom; i>=top && count<=size;i--){
                mat[i][left] = count++;
            }
            left++;
        }
        return mat;
    }
}