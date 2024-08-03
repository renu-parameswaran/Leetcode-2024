class Solution {
    public void sortColors(int[] nums) {
       int p0 = 0, curr = 0;
       int p2 = nums.length - 1;
       
       while(curr <= p2){
        if(nums[curr] == 0){
            swap(nums, p0, curr);
            p0++;
            curr++;
        } else if(nums[curr] == 2){
            swap(nums, curr, p2);
            p2--;
        } else{
            curr++;
        }
       }
    }

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

// TC: O(N)
// SC: O(1)