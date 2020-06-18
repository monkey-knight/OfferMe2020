/**
 * @Title: Sum_of_Square_Numbers_633
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/5/13 15:08
 * @Description:
 */
public class Sum_of_Square_Numbers_633 {
}

class Solution2 {
    public boolean judgeSquareSum(int c) {
        int index1 = 0, index2 = (int)Math.sqrt(c);
        while (index1 <= index2){
            if ((int)Math.pow(index1, 2) + (int)Math.pow(index2, 2) < c){
                index1 ++;
            }
            else if ((int)Math.pow(index1, 2) + (int)Math.pow(index2, 2) > c){
                index2 --;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
