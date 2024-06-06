// 283. Move Zeroes

import java.util.*;

class Solution{
    public static int[] moveZeroes(int[] nums){
        int n = nums.length;
        int left = 0;
        for(int right = 0; right< n; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        return nums;
    }
  
    public static void main(String[] args){
        int nums[] = {1,0,9,7,0};
        moveZeroes(nums);
        System.out.println("result array is:"+ Arrays.toString(nums));
    }
}

// TC: O(n)
// SC: O(1)

