// 56. Merge Intervals
import java.util.*;

class Solution{
    public static int[][] merge(int[][] intervals){
      Arrays.sort(intervals, (a, b)-> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1]< interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,4},{6,10}};
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}

// TC: O(nlogn)
// SC: O(logn) or O(n)