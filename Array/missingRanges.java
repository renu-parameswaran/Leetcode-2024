import java.util.*;

class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
    List<List<Integer>> result = new ArrayList<>();
    int next = lower;

    for(int i = 0; i < nums.length; i++){
        if(nums[i] < next){
            continue;
        }

        if(nums[i] == next){
            next++;
            continue;
        }
        result.add(Arrays.asList(next, nums[i] - 1));
        next = nums[i] + 1;
    }

    if(next <= upper){
        result.add(Arrays.asList(next, upper));
    }

    return result;  
    }

}

// TC: O(n)
// SC: O(1)