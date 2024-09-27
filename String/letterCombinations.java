import java.util.*;

class Solution {

    private static final String[] KEYPAD = {
        "",      // 0
        "",      // 1
        "abc",   // 2
        "def",   // 3
        "ghi",   // 4
        "jkl",   // 5
        "mno",   // 6
        "pqrs",  // 7
        "tuv",   // 8
        "wxyz"  // 9
    };
    // mapping of digits to corresponding letters
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // if digits is empty, return an empty list
        if(digits == null || digits.length() == 0){
            return result;
        }

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for(char letter: letters.toCharArray()){
            current.append(letter);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}


// TC: O(4 ^ N * N)
// SC: O(N) // N is length of digits