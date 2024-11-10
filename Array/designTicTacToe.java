class TicTacToe {

    private int[] rows;
    private int[] cols;
    private int diagonal;
    private int antiDiagonal;
    private int n;

    public TicTacToe(int n) {
        this.n = n;
        this.rows = new int[n];
        this.cols = new int[n];
        this.diagonal = 0;
        this.antiDiagonal = 0;
    }
    
    public int move(int row, int col, int player) {
        int add = (player == 1) ? 1: -1;
        rows[row] += add;
        cols[col] += add;

        if(row == col){
            diagonal += add;
        }

        if(row + col == n - 1){
            antiDiagonal += add;
        }

        if(Math.abs(rows[row]) == n ||
           Math.abs(cols[col]) == n ||
           Math.abs(diagonal) == n ||
           Math.abs(antiDiagonal) == n){
            return player;
           }

        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */


 // TC: O(1)
 // SC: O(N) for rows array and column array
