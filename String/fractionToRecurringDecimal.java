import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0){
            return "0";
        }
        StringBuilder result = new StringBuilder();

        if((numerator < 0) ^ (denominator < 0)){
            result.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(num / den);
        long remainder = num % den;

        if(remainder == 0){
            return result.toString();
        }
        result.append(".");
        HashMap<Long, Integer> remainderMap = new HashMap<>();

        while(remainder != 0){
            if(remainderMap.containsKey(remainder)){
                int index = remainderMap.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }

            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}

// TC: O(k) where k is the number of digits in the fractional part before repetition or termination
// SC: O(k) for storing remainders in the HashMap.