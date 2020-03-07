package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        try {
            // 创建一个文件字符输入流
            FileReader fr = new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileReader.java");
            int res;
            while((res = fr.read()) != -1){
                System.out.print((char)res);
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
