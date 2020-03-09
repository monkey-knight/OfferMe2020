package IO;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) {
        // 创建一个带缓冲区的输入字符流
        BufferedReader br;
        // 创建一个文件输入字符流
        FileReader fr;

        int res;
        try {
            fr = new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestBufferedReader.java");
            br = new BufferedReader(fr);
            while ((res = br.read()) != -1) {
                System.out.print((char) res);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
