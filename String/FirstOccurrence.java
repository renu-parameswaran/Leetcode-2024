//28. Find the Index of the First Occurrence in a String

class Solution{
    public static int strStr(String haystack, String needle){
        int m = needle.length();
        int n = haystack.length();

        for(int windowStart = 0; windowStart <= n -m; windowStart++){
            for(int i = 0; i< m; i++){
                if(needle.charAt(i) != haystack.charAt(windowStart + i)){
                    break;
                }
                if(i == m-1){
                    return windowStart;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
      String haystack = "sadbutsad";
      String needle = "sad";
      int index_value = strStr(haystack, needle);
      System.out.println(index_value);
    }
}

// TC: O(n-m+ 1) * m or O(n*m)
// SC: O(1)