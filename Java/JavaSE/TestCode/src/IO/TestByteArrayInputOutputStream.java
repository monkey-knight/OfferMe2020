package IO;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestByteArrayInputOutputStream {
    public static void main(String[] args) {
        // 创建一个字节数组输出流，直接与内存中的某个区域相连
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(5);
        // 创建一个字节数组输入流，直接与内存中的某个区域相连
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        int res;
        while ((res = bis.read()) != -1){
            System.out.println(res);
        }
    }
}
