package IO;


import java.io.*;

/**
 * InputStreamReader 是转换流（处理流，套在字节流之上），其可以将字节输入流转换程字符输入流
 */

public class TestInputStreamReader {
    public static void main(String[] args) {
        // 创建一个字节输入流
        FileInputStream fis;
        // 创建一个字节流向字符流转换的转换流
        InputStreamReader isr;

        int res;
        try {
            fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestInputStreamReader.java");
            isr = new InputStreamReader(fis);
            while ((res = isr.read()) != -1) {
                System.out.print((char) res);
            }
            isr.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
