class Solution{
    public int findSum(int a , int b){
        return a+b;
    }

    public static void main(String args[]){
        Solution solution = new Solution();
        int result = solution.findSum(2, 3);
        System.out.println("sum is"+ result);
    }
}