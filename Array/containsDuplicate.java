// 217. Contains Duplicate

import java.util.*;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int num: nums){
            if(seen.containsKey(num) && seen.get(num) >= 1){
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
    public static void main(String[] args){
      int[] nums = {1,2,3,4,8,1};
      boolean result = containsDuplicate(nums);
      System.out.println(result);
    }
}


// TC: O(n)
// SC: O(n)