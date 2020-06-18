import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @Title: Longest_Word_in_Dictionary_through_Deleting_524
 * @ProjectName JavaGuide
 * @Auther: beddingearly
 * @Date: 2020/6/16 15:20
 * @Description:
 */
public class Longest_Word_in_Dictionary_through_Deleting_524{
    public static void main(String[] args) {
        //"bab"["ba","ab","a","b"]

        String s = "bab";
        List<String> d = new ArrayList<>();
        String [] data = {"ba","ab","a","b"};
        d.addAll(Arrays.asList(data));
        Solution6 ss = new Solution6();
        System.out.println(ss.findLongestWord(s, d));
    }

}

class Solution6 {
    public String findLongestWord(String s, List<String> d) {
        int flag = 0;
        String ss = new String();
        for (int i = 0; i < d.size(); i ++){
            int index1 = 0, index2 = 0;
            while (index1 < s.length() && index2 < d.get(i).length()){
                if (s.charAt(index1) == d.get(i).charAt(index2)){
                    index2 ++;
                }
                index1 ++;
            }
            if (index2 > flag ||(index2 == flag && ss.compareTo(d.get(i)) > 0)){
                flag = index2;
                ss = d.get(i);
            }
        }
        return ss;
    }
}