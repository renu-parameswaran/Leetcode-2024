class Solution {
    public void solve(char[][] board) {
    if(board == null || board.length == 0 || board[0].length == 0){
        return;
    }
    int m = board.length;
    int n = board[0].length;

    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if((i == 0 || i == m - 1 || j == 0 || j == n - 1) && board[i][j] == 'O'){
                markBorder(board, i, j);
            }
        }
    }

    // flipping

    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(board[i][j] == 'O'){
                board[i][j] = 'X';
            } else if(board[i][j] == 'T'){
                board[i][j] = 'O';
            }
        }
    }

    }

    private void markBorder(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O'){
            return;
        }

        board[i][j] = 'T';

        markBorder(board, i - 1, j);
        markBorder(board, i + 1, j);
        markBorder(board, i , j - 1);
        markBorder(board, i , j + 1);
    }
}

// TC: O(m * n)
// SC: O(m * n)