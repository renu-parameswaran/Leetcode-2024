//136. Single Number

// xor logic
// a ^ a' = 1
// a ^ a = 0
// 0 ^ a' = a'

class Solution{
    public static int singleNumber(int[] nums){
        int xor_value = 0;
        for (int i = 0; i< nums.length; i++){
            xor_value = xor_value ^ nums[i];
        }
        return xor_value;
    }
    public static void main(String[] args){
        int[] nums = { 1, 2, 2, 1, 5};
        int single_number = singleNumber(nums);
        System.out.println("single number is: "+ single_number);
    }
}

// TC: O(n)
// SC: O(1)