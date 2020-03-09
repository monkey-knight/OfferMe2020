package IO;

import java.io.*;

/**
 * FileOutputStream 是一个文件输出字节流，且是一个节点流
 * FileOutputStream 直接连接一个文件，一次写入一个字节
 */

public class TestFileOutputStream {
    public static void main(String[] args) {
        // 创建一个文件输入字节流
        FileInputStream fis;
        // 创建一个文件输出字节流
        FileOutputStream fos;

        try {
            fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileOutputStream.java");
            fos = new FileOutputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\FileOutputStream.txt");
            int res;
            while ((res = fis.read()) != -1) {
                fos.write(res);
            }
            fis.close();
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件复制成功");
    }
}
