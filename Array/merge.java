// 88. Merge Sorted Array
import java.util.Arrays;

class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m- 1, p2 = n-1;
        for(int p = m + n - 1; p >= 0; p--){
            if(p2 < 0)
            break;
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }else{
                nums1[p] = nums2[p2--];
            }
        }
        return nums1;
    }
    public static void main(String[] args){
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5 , 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
