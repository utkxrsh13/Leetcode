class Solution {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);

        for(int i = 1;i<m;i++){
            int[] currentRow=new int[n];
            Arrays.fill(currentRow, 1);
            for(int col= 1;col<n;col++){
                currentRow[col] = currentRow[col - 1]+row[col];
            }
            row = currentRow;
        }

        return row[n - 1];  
    }
}