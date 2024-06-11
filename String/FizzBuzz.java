// 412. Fizz Buzz
import java.util.*;

class Solution {
 public static List<String> fizzBuzz(int n) {

    HashMap<Integer, String> fizzBuzzDict = new HashMap<Integer, String>();
    fizzBuzzDict.put(3, "Fizz");
    fizzBuzzDict.put(5, "Buzz");

    List<String> answer = new ArrayList<String>();
    List<Integer> divisors = new ArrayList<>(Arrays.asList(3,5));

    for(int i = 1; i<=n; i++){
        String numStr = "";
        for(Integer key: divisors){
            if(i % key == 0){
                numStr += fizzBuzzDict.get(key);
            }
        }
        if(numStr.equals("")){
            numStr += Integer.toString(i);
        }
        answer.add(numStr);
    }
    return answer;
}

public static void main(String[] args){

    int n = 5;
    List<String> result = new ArrayList<>();
    result = fizzBuzz(n);
    System.out.println(result);
}
}

// TC: O(n)
// SC: O(1)
