class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0){
            return 0;
        }
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++){
            int ht = (i == n)? 0: heights[i];

            if(stack.isEmpty() || ht >= heights[stack.peek()]){
                stack.push(i);
            } else{
                int top = stack.pop();
                int width = stack.isEmpty()? i: i - stack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
                i--;
            }
        }
        return maxArea;
    }
}

// TC: O(n)
// SC: O(n)