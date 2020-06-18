/**
 * @Title: Two_Sum_II_167
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/5/13 12:39
 * @Description:
 */
public class Two_Sum_II_167 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.twoSum(new int[]{1,2,3,4,5}, 5)[0]);
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length - 1;
        while(target != numbers[index1] + numbers[index2]){
            if (numbers[index1] + numbers[index2] > target){
                index2 --;
            }
            else{
                index1 ++;
            }
        }
        return new int[]{++index1, ++index2};
    }
}