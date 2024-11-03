class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        int a = dividend > 0 ? -dividend : dividend;
        int b = divisor > 0 ? -divisor : divisor;

        int result = 0;

        while(a <= b){
            int tempDivisor = b, multiple = 1;
            while(a - tempDivisor <= tempDivisor){
                tempDivisor <<= 1;
                multiple <<= 1;
            }

             a -= tempDivisor;
             result += multiple;
        }

        return negative ? - result : result;
    }
}

// TC: O(logN)
// SC: O(1)