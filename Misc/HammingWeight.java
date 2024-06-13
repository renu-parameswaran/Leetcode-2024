// 191. Number of 1 Bits

class Solution {
    public static int hammingWeight(int n){
      int sum = 0;
      while(n != 0){
          sum++;
          n &= (n -1);
      }
      return sum;
    }

    public static void main(String[] args){
        int number = 11;
        int result = hammingWeight(number);
        System.out.println("result is "+ result);
    }
  }

  // TC: O(1)
  // SC: O(1)