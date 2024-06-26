// 162. Find Peak Element

class Solution {
    public static int findPeakElement(int[] nums) {
        int l = 0 , r = nums.length - 1;
        while(l < r){
            int mid = (l + r)/2;
            if(nums[mid] > nums[mid + 1]){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        int result = findPeakElement(nums);
        System.out.println(result);
    }
}

// TC: O(logn)
// SC: O(1)