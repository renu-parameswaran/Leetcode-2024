// 49. Group Anagrams
import java.util.*;

class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> ans = new HashMap<String, List<String>>();
        int[] count = new int[26];
        for(String s: strs){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i <26;i++){
             sb.append("#");
             sb.append(count[i]);
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());
    }
    public static void main(String[] args){
        String[] strs = {"ate", "eat", "cat", "bat", "tab"};
        List<List<String>> resultList = groupAnagrams(strs);
        System.out.println(resultList);
    }
}

// TC: O(n*k)
// SC: O(n*k)