import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;;
        int left = 0, right = n -1;
        int[] result = new int[n];
        for(int i = n-1; i >= 0; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            }
            else{
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = new int[]{-8,-2, -1,3, 6, 6};
        int[] answer = s.sortedSquares(nums);
        System.out.println(Arrays.toString(answer));
    }
}

// TC: O(n)
// SC: O(n)
