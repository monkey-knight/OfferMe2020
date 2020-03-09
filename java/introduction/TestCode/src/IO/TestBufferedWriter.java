package IO;

import java.io.*;

public class TestBufferedWriter {
    public static void main(String[] args) {
        // 创建一个带缓冲区的输入字符流
        BufferedReader br;
        // 创建一个带缓冲区的输出字符流
        BufferedWriter bw;

        int res;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\IO\\TestBufferedWriter.java"));
            bw = new BufferedWriter(new FileWriter("C:\\Users\\monkeyknight\\Documents\\LearnMe\\GitRepositories\\OfferMe2020\\java\\introduction\\TestCode\\src\\output\\BufferedWriter.txt"));
            while ((res = br.read()) != -1) {
                bw.write(res);
            }
            bw.flush();
            bw.close();
            br.close();
            System.out.println("文件复制成功");
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定的文件");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
