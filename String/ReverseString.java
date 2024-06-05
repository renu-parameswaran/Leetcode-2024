//344. Reverse String

// Two pointer approach
class Solution{
    public String reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("reversed string is: "+ solution.reverseString(s));
    }
}


// Space Complexity: O(1)
// Time Complexity: O(n)