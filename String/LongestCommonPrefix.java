// 14. Longest Common Prefix

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // Horizontal scanning
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            if(prefix.isEmpty()){
                return "";
            }
            }
        }
    return prefix;
    }
    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}

// TC: O(S) where S is sum of all characters in all strings
// SC: O(1)