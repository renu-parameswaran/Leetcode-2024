import java.util.*;

class Solution{
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int totalSum = (n * (n + 1))/2;
        int actualSum = Arrays.stream(nums).sum();
        return totalSum - actualSum;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int missing_number = missingNumber(nums);
        System.out.println(missing_number);
    }
    
}

// TC: O(n)
// SC: O(1)