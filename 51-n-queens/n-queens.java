class Solution {
    List<List<String>> res = new ArrayList<>();
    char[][] board;
    int n;

    Set<Integer> cols = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();
    Set<Integer> diag2 = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        board = new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        
        backtrack(0);
        return res;
    }

    private void backtrack(int row){
        if(row==n){
            res.add(constructor());
            return;
        }

        for(int col=0;col<n;col++){
            if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)){
                continue;
            }

            board[row][col] = 'Q';
            cols.add(col);
            diag1.add(row-col);
            diag2.add(row+col);

            backtrack(row+1);

            board[row][col] = '.';
            cols.remove(col);
            diag1.remove(row-col);
            diag2.remove(row+col);
        }
    }
    private List<String> constructor(){
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(new String(board[i]));
        }
        return temp;
    }
}