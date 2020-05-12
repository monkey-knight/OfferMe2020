package IO;

import java.io.*;

/**
 * FileReader 是一个文件输入字符流，且是节点流
 * FileReader 直接连接到一个文件，一次读取一个字符
 */

public class TestFileReader {
    public static void main(String[] args) {
        // 创建一个文件输入字符流
        FileReader fr;
        int res;
        int numChar = 0;
        try {
            fr = new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileReader.java");
            while ((res = fr.read()) != -1) {
                System.out.print((char) res);
                numChar++;
            }
            fr.close();
            System.out.println("总共读取了 " + numChar + " 个字符");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }

    }
}
