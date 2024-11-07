import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict){
     Set<String> wordSet = new HashSet<>(wordDict);
     Map<String, List<String>> memo = new HashMap<>();
     return backtrack(s, wordSet, memo);
    }
 
    private List<String> backtrack(String s, Set<String> wordSet, Map<String, List<String>> memo){
     if(memo.containsKey(s)){
         return memo.get(s);
     }
 
     List<String> result = new ArrayList<>();
     if(s.isEmpty()){
         result.add("");
         return result;
     }
 
     for(int i = 1; i <= s.length(); i++){
         String prefix = s.substring(0, i);
         if(wordSet.contains(prefix)){
             List<String> suffixWays = backtrack(s.substring(i), wordSet, memo);
             for(String suffix: suffixWays){
                 result.add(prefix + (suffix.isEmpty()? "": " ") + suffix);
             }
         }
     }
     memo.put(s, result);
     return result;
    }
 }
 
 // TC: O(n * 2 ^ n) where 2 ^ n possible substrings leads to exponential time
 // SC: O(n * 2 ^ n) where recursion stack can grow up to n and memoization map to store all the possible substrings