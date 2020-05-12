package IO;

import java.io.*;

public class TestOutputStreamWriter {
    public static void main(String[] args) {
        // 创建一个文件字节输入流
        FileInputStream fis;
        // 创建一个文件字节输出流
        FileOutputStream fos;
        // 创建字节流向字符流转换的转换流
        InputStreamReader ir;
        OutputStreamWriter ow;

        int res;
        try{
            fis = new FileInputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestOutputStreamWriter.java");
            ir = new InputStreamReader(fis);
            fos = new FileOutputStream("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\OutputStreamWriter.txt");
            ow = new OutputStreamWriter(fos);
            while((res = ir.read()) != -1){
                ow.write(res);
            }
            ow.flush();
            ow.close();
            ir.close();
        }catch (FileNotFoundException e){
            System.out.println("找不到指定的文件");
            System.exit(-1);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
