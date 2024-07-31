class Solution {
    public int maxArea(int[] height) {
       int left = 0, right = height.length - 1;
       int maxArea = 0;
       while(left < right){
        int width = right - left;
        int current = Math.min(height[left], height[right]) * width;
        maxArea = Math.max(maxArea, current);
        if(height[left] < height[right]){
            left++;
        } else{
            right--;
        }
       } 
       return maxArea;
    }
}

// TC: O(n)
// SC: O(1)