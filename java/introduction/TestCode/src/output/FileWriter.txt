package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        try {
            // 创建一个字符输入流
            FileReader fr = new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileWriter.java");
            // 创建一个字符输出流
            FileWriter fw = new FileWriter("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\FileWriter.txt");

            int res;
            while((res = fr.read()) != -1){
                fw.write(res);
            }

            fr.close();
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
