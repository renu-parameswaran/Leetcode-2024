class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low < high){
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            if(count < k){
                low = mid + 1;
            } else{
                high = mid;
            }
        }

        return low;
    }

    private int countLessEqual(int[][] matrix, int target){
        int n = matrix.length;
        int count = 0, row = n - 1, col = 0;

        while(row >= 0 && col < n){
            if(matrix[row][col] <= target){
                count += row + 1;
                col++;
            } else{
                row--;
            }
        }
        return count;
    }
}

// TC: O(n * log(max - min))
// SC: O(1)