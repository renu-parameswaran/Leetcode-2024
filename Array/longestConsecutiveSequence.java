import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums){
     Set<Integer> num_set = new HashSet<Integer>();
     for(int num: nums){
         num_set.add(num);
     }
     int longestStreak = 0;
 
     for(int num: num_set){
         if(!num_set.contains(num - 1)){
             int currentNum = num;
             int currentStreak = 1;
 
             while(num_set.contains(currentNum + 1)){
                 currentStreak++;
                 currentNum += 1;
             }
             longestStreak = Math.max(longestStreak, currentStreak);
         }
     }
     return longestStreak;
    }
 }
 
 // TC: O(n)
 // SC: O(n)