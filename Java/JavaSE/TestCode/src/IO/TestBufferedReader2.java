package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader2 {
    public static void main(String[] args) {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            while(!(str = bis.readLine()) .equals("exit")){
                System.out.println(str);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
