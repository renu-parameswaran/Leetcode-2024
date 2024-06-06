// Moore voting algorithm

class Solution {
    public static int majorityElement(int[] nums){
        int count = 0;
        int candidate = 0;
        
        for (int num : nums){
            if(count == 0){
                candidate = num;
            }

            if (num == candidate){
                count +=1;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,2,2,1};
        int result = majorityElement(nums);
        System.out.println("result is:"+result);
    }
}

//TC: O(n)
//SC: O(1)