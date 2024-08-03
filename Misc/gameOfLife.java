public class gameOfLife {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Iterate through board cell by cell.
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Count the number of live neighbors.
                int liveNeighbors = countLiveNeighbors(board, row, col);

                // Apply the rules of the Game of Life.
                // Rule 1 or Rule 3: Any live cell with fewer than two or more than three live neighbors dies.
                if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = -1; // -1 signifies the cell was originally live but now dead.
                }
                // Rule 4: Any dead cell with exactly three live neighbors becomes a live cell.
                if (board[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 2; // 2 signifies the cell was originally dead but now live.
                }
            }
        }

        // Update the board to the next state.
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int row, int col) {
        int count = 0;
        int rows = board.length;
        int cols = board[0].length;

        // Iterate through all the neighbors.
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue; // Skip the current cell.

                int r = row + i;
                int c = col + j;

                if (r >= 0 && r < rows && c >= 0 && c < cols && Math.abs(board[r][c]) == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}


// TC: O(M*N)
// SC: O(1)