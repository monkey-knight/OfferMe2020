package IO;

import java.io.*;

/**
 * FileInputStream 是一个文件输入字节流，且是节点流。
 * FileInputStream 直接连接到一个文件，一次读取一个字节。
 */

public class TestFileInputStream {
    public static void main(String[] args) {
        // 创建一个文件读取字节流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileInputStream.java");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        int res;
        int numByte = 0;
        try {
            while ((res = fis.read()) != -1) {
                System.out.print((char) res);
                numByte++;
            }
            fis.close();
            System.out.println();
            System.out.println("总共读取了 " + numByte + " 个字节");
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
