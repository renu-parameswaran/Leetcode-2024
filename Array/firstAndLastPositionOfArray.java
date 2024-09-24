class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);
        return result;
    }

    private int findLeft(int[] nums, int target){
        int index = -1;
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] >= target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if(nums[mid] == target){
                index = mid;
            }
        }

        return index;
    }

    private int findRight(int[] nums, int target){
        int index = -1;
        int left = 0, right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(nums[mid] <= target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }

            if(nums[mid] == target){
                index = mid;
            }
        }

        return index;
    }
}

// TC: O(logn)
// SC: O(1)