/**
 * @Title: Valid_Palindrome_II_680
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/6/16 09:53
 * @Description:
 */
public class Valid_Palindrome_II_680 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();

    }
}
class Solution4{
    public boolean validPalindrome(String s) {
        int index1 = 0;
        int index2 = s.length()-1;
        while (index1 <= index2){
            if (s.charAt(index1) != s.charAt(index2)){
                return (isPalindrome(s, index1+1, index2) || isPalindrome(s, index1, index2-1));
            }
            else{
                index1 ++;
                index2 --;
            }
        }
        return true;
    }
    protected boolean isPalindrome(String s, int index1, int index2){
        while (index1 <= index2){
            if (s.charAt(index1) != s.charAt(index2)){
                return false;
            }
            else {
                index1 ++;
                index2 --;
            }
        }
        return true;
    }
}