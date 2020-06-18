/**
 * @Title: Merge_Sorted_Array_88
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/6/16 12:20
 * @Description:
 */
public class Merge_Sorted_Array_88 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        int [] a = {3, 5, 6, 0, 0, 0, 0};
        int [] b = {2, 4, 8, 9};
        s.merge(a, 3, b, 4);

    }
}
class Solution5 {//尾插法
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int mergeindex = m + n - 1;
        while (index1 >= 0 || index2 >=0){
            if (index1 < 0){
                nums1[mergeindex --] = nums2[index2 --];
            }
            else if (index2 < 0){
                nums1[mergeindex --] = nums1[index1 --];
            }
            else if (nums1[index1] > nums2[index2]){
                nums1[mergeindex--] = nums1[index1--];
            }
            else if (nums1[index1] <= nums2[index2]){
                nums1[mergeindex--] = nums2[index2--];
            }
        }
    }
}