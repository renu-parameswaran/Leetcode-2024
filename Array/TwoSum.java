import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)){
                return new int[] {numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        TwoSum solution = new TwoSum();
        int[] nums = {1,2,3,4,5 };
        int target = 5;
        int[] result =solution.twoSum(nums, target);
        System.out.println("Indices: "+ "["+ result[0] + ","+ result[1] + "]" );
    }
}


// Time Complexity: O(n)
// Space Complexity: O(n)