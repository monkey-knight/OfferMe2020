package IO;

import java.io.*;

public class TestBufferedOutputStream {
    public static void main(String[] args) {
        // 创建一个带缓冲区的输入字节流
        BufferedInputStream bis;
        // 创建一个带缓冲区的输出字节流
        BufferedOutputStream bos;

        int res;
        try {
            bis = new BufferedInputStream(new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestBufferedOutputStream.java"));
            bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\BufferedOutputStream.txt"));
            while ((res = bis.read()) != -1) {
                bos.write(res);
            }
            bos.flush();
            bos.close();
            bis.close();
            System.out.println("文件复制成功");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
