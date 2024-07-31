class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){ 
            return 0;
        }

        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;

        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
              if (nums[i] < 0) {
                // Swap maxProduct and minProduct if nums[i] is negative
                int temp = max_so_far;
                max_so_far = min_so_far;
                min_so_far = temp;
            }
            max_so_far = Math.max(curr, curr * max_so_far);
            min_so_far = Math.min(curr, curr * min_so_far);

            result = Math.max(max_so_far, result);
        }
        return result;
    }
}

// TC: O(N)
// SC: O(1)