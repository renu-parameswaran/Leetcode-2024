class Solution {
    public boolean isPowerOfThree(int n) {
       if(n < 1){
        return false;
       } 

       while(n % 3 == 0){
        n /= 3;
       }

       return n == 1;
    }
}


// TC: O(log3n)
// SC: O(1)