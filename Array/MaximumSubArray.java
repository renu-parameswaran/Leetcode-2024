// 53. Maximum Subarray

class Solution {
    public static int maxSubArray(int[] nums) {
         int currentSubArray = nums[0];
         int maxSubArray = nums[0];

         for(int i = 1; i< nums.length; i++){
            int num = nums[i];
            currentSubArray = Math.max(num, num + currentSubArray);
            maxSubArray = Math.max(maxSubArray, currentSubArray);
         }
         return maxSubArray;
    }
    public static void main(String[] args){
        int[] nums = {-4, 3, 2, 1 , 5};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}

// TC: O(n)
// SC: O(1)