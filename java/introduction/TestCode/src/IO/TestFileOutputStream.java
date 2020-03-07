package IO;

import java.io.*;

public class TestFileOutputStream {
    public static void main(String[] args) {
        try {
            // 创建一个文件字节输入流
            FileInputStream fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileOutputStream.java");
            // 创建一个文件字节输出流
            FileOutputStream fos = new FileOutputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\FileOutputStream.txt");
            int res;
            while((res = fis.read()) != -1){
                fos.write(res);
            }

            fis.close();
            fos.flush();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
