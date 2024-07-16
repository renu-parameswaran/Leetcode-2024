public class fib {
    
}
class Solution {
    public int fib(int N) {
        if(N <= 1){
            return N;
        }

        int current = 0;
        int prev2 = 0;
        int prev1 = 1;

        for(int i = 2; i <= N; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}

// TC: O(N)
// SC: O(1)