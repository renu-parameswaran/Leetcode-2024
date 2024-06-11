//387. First Unique Character in a String
import java.util.*;

class Solution {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i <s.length();i++){
            if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "leetcode";
        int index = firstUniqChar(s);
        System.out.println(index);
    }
}

// TC: O(n)
// SC: O(1)