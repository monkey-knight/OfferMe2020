package IO;

import java.io.*;

/**
 * FileWriter 是一个文件输出字符流，且是一个节点流
 * FileWriter 直接连接到一个文件，且一次写入一个字符
 */

public class TestFileWriter {
    public static void main(String[] args) {
        // 创建一个文件输入字符流
        FileReader fr;
        // 创建一个文件输出字符流
        FileWriter fw;
        int res;
        try {
            fr = new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileWriter.java");
            fw = new FileWriter("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\FileWriter.txt");

            while ((res = fr.read()) != -1) {
                fw.write(res);
            }
            fr.close();
            fw.flush();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
        System.out.println("文件复制成功");
    }
}
