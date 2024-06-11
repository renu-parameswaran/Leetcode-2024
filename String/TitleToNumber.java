// 171. Excel Sheet Column Number

class Solution {
    public static int titleToNumber(String columnTitle){
     int result = 0;
     int n = columnTitle.length();
     for(int i = 0; i < n; i++){
         result = result * 26;
         result += (columnTitle.charAt(i)- 'A' + 1);
     }
     return result;
    }
    public static void main(String[] args){
        String title = "AB";
        int title_Number = titleToNumber(title);
        System.out.println(title_Number);
    }
 }


 // TC: O(n)
 // SC: O(1)