package IO;

import java.io.*;

public class TestBufferedInputStream {
    public static void main(String[] args) {
        // 创建一个文件输入字节流
        FileInputStream fis;
        // 创建一个带缓冲区的输入字节流
        BufferedInputStream bis;

        int res;
        try {
            fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestBufferedInputStream.java");
            bis = new BufferedInputStream(fis);
            while ((res = bis.read()) != -1) {
                System.out.print((char) res);
            }
            bis.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
