import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Title: Reverse_Vowels_of_a_String_345
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/5/13 19:08
 * @Description:
 */
public class Reverse_Vowels_of_a_String_345 {
    public static void main(String[] args) {
        Solution1 a = new Solution1();
        System.out.println(a.reverseVowels(new String("leetcode")));
    }
}
class Solution1 {
    public String reverseVowels(String s) {
        int index1 = 0, index2 = s.length() - 1;
        char [] ss = new char[s.length()];
        List<Character> list = new ArrayList<>();
        char [] yuan = new char[]{'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        for(char i: yuan){
            list.add(i);
        }
        while (index1 <= index2){
            if (!list.contains(s.charAt(index1))){
                ss[index1] = s.charAt(index1);
                index1 ++;
            }
            else if (!list.contains(s.charAt(index2))){
                ss[index2] = s.charAt(index2);
                index2 --;
            }
            else {
                ss[index1] = s.charAt(index2);
                ss[index2] = s.charAt(index1);
                index1 ++;
                index2 --;
            }
        }
        if (s.length() > 1){
            s = new String(ss);
        }
        return s;
    }
}