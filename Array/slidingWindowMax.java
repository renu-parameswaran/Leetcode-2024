class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < n; i++){
            // Remove elements not within the window
            if(!deque.isEmpty() && deque.peekFirst() == i - k){
                deque.pollFirst();
            }

            //Remove elements from the back if they are smaller than the current element
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);
            if(i >= k - 1){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}

// TC: O(n)
// SC: O(k) // maximum of sixe k