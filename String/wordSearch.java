class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.length() == 0){
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == word.charAt(0) && backtrack(board, word, i , j , 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int i , int j, int index){
        if(index == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean found = backtrack(board, word, i + 1, j, index + 1) ||
                        backtrack(board, word, i - 1, j, index + 1) ||
                        backtrack(board, word, i, j + 1, index + 1) ||
                        backtrack(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // unmark the cell

        return found;
    }
}

// TC: O(N * 4^L) where N is the number of cells in grid and L is the length of the word
// SC: O(L) //  where L is the length of the word and the number of recursive calls