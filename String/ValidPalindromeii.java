class Solution {
    public boolean checkPalindrome(String s, int i , int j){
        while(i <j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return (checkPalindrome(s, i , j-1) || checkPalindrome(s, i+1, j));
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        String st = "abca";
        boolean result = s.validPalindrome(st);
        System.out.println(result);
    }
}

// TC: O(n)
// SC: O(1)