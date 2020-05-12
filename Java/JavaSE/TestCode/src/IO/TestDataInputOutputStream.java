package IO;

import java.io.*;

public class TestDataInputOutputStream {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);

        try {
            dos.writeDouble(Math.random());
            dos.write('a');
            byte[] b = new byte[]{1, 2, 3, 4, 5};
            dos.write(b);
            dos.write(b, 1, 2);
            dos.writeBoolean(true);
            dos.writeChar('b');
            dos.writeChars("abcdefghijklmnopqrstuvwxyz");
            dos.writeInt(255);
            dos.writeShort(10);
            dos.writeLong(1000);
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bos.toByteArray()));
            System.out.println(dis.readDouble());
            System.out.println(dis.read());
            byte[] res = new byte[b.length];
            dis.read(res);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + ", ");
            }
            System.out.println();
            byte[] b1 = new byte[b.length];
            dis.read(b1, 1, 2);
            for (int i = 0; i < b1.length; i++) {
                System.out.print(b1[i] + ", ");
            }
            System.out.println();
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            for (int i = 0; i < 26; i++) {
                System.out.print(dis.readChar());
            }
            System.out.println();
            System.out.println(dis.readInt());
            System.out.println(dis.readShort());
            System.out.println(dis.readLong());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
