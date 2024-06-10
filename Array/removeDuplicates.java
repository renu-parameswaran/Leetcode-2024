// 26. Remove Duplicates from Sorted Array
import java.util.*;

class Solution {
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int insertIndexUnique = 1;
        for(int j = 1; j < n; j++ ){
            if(nums[j-1] != nums[j]){
                nums[insertIndexUnique] = nums[j];
                insertIndexUnique++;
            }
        }
        return insertIndexUnique;
    }
    public static void main(String[] args){
        int nums[] = {1,1,2,2,3,4,4,5};
        int k = removeDuplicates(nums);
        System.out.println("length is "+k);
        System.out.println("Array is "+Arrays.toString(Arrays.copyOf(nums, k)));
    }
}

// TC: O(n)
// SC: O(1)