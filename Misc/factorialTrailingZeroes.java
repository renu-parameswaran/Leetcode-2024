class Solution {
    public int trailingZeroes(int n) {
       int count = 0;
       while(n > 0){
        n /= 5;
        count += n;
       }
       return count;
    }
}

// TC: O(logn)
// SC: O(1)