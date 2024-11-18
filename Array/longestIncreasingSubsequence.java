import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
      List<Integer> sub = new ArrayList<>();
      for(int num: nums){
        int idx = binarySearch(sub, num);
        if(idx < sub.size()){
            sub.set(idx, num);
        } else{
            sub.add(num);
        }
      }
      return sub.size();
    }

    private static int binarySearch(List<Integer> sub, int target){
        int left = 0, right = sub.size() - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(sub.get(mid) >= target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }
}