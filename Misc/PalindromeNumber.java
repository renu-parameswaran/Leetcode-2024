// 9. Palindrome Number

class Solution {
    public static boolean isPalindrome(int x){
     if(x < 0 || (x % 10 == 0 && x != 0)){
        return false;
     }

     int revertedNumber = 0;
     while(x > revertedNumber){
        revertedNumber = revertedNumber * 10 + (x % 10);
        x /= 10;
     }

     return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args){
        int number = 121;
        boolean result = isPalindrome(number);
        System.out.println(result);
    }
}

// TC: O(log10n)
// SC: O(1)