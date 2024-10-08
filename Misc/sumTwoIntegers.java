class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        return a;
    }
}

// TC: O(1)
// SC: O(1)