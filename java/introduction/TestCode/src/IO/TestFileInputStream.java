package IO;
import java.io.*;


public class TestFileInputStream {
    public static void main(String[] args) {
        // 创建一个文件读取字节流
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestFileInputStream.java");
            int res;
            while((res = fis.read()) != -1){
                System.out.print((char)res);
            }
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
