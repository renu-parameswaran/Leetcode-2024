// Fisher yates Algorithm

import java.util.*;

class Solution {
    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        original = nums.clone();
        array = nums;
        rand = new Random();
    }
    
    public int[] reset() {
        // array = original.clone();
        return original;
    }

    private void swap(int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public int[] shuffle() {
        for(int i = array.length - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            swap(i, j);
        }
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */


// TC: O(n)
// SC: O(n)