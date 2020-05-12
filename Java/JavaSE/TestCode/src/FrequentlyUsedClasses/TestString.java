package FrequentlyUsedClasses;

import java.io.UnsupportedEncodingException;

/**
 * 在 java 中不存在运算符重载，那么 String 类中的 = 和 + 是如何实现的？
 * <p>
 * 答：这其实是 JVM 做的一个语法糖。可以查看字节码文件
 */

public class TestString {
    public static void main(String[] args) {
        // =====================================创建字符串=====================================
        // 1. 通过赋值符号来创建字符串类
        String str = "abcd";
        System.out.println("[通过赋值符号来创建字符串类]: " + str);

        // 2. 通过将字节数组来创建字符类
        // (1) 使用平台的默认字符集解码指定的字节数组来构建新的 String
        byte[] a = new byte[]{80, 90, 100, 40, 50, 60};
        str = new String(a);
        System.out.println("[默认字符集解码指定的字节数组来构建新的 String]: " + str);
        // (2) 使用指定字符集解码指定的字节数组来构建新的 String
        try {
            str = new String(a, "UTF8");
            System.out.println("[指定字符集解码指定的字节数组来构建新的 String]: " + str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // (3) 使用平台的默认字符集解码指定的字节数组子序列来构建新的 String
        str = new String(a, 2, 4);
        System.out.println("[使用平台的默认字符集解码指定的字节数组子序列来构建新的 String]: " + str);

        // (4) 使用指定字符集解码指定的字节数组子序列来构建新的 String
        try {
            str = new String(a, 2, 4, "GBK");
            System.out.println("[使用指定字符集解码指定的字节数组子序列来构建新的 String]: " + str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 3. 使用字符数组来创建新的 String
        // (1)
        char[] b = new char[]{'a', 'b', 'c'};
        str = new String(b);
        System.out.println("[使用字符数组来创建新的 String]: " + str);
        // (2) 使用字符数组子序列来创建新的 String
        str = new String(b, 1, 2);
        System.out.println("[使用字符数组子序列来创建新的 String]: " + str);

        // 4. 使用字符串创建字符串副本
        String str2 = new String(str); // 相当于 String str2 = str;
        System.out.println("[原字符串]：" + str);
        System.out.println("[使用字符串创建字符串副本]: " + str2);


        // ================================查询字符串=====================================
        str = "abcdefghijklmnopqrstuvwxyz";
        // 1. 查询某个索引处的字符
        char ch = str.charAt(1);
        System.out.println("[索引 " + 1 + " 处的字符]：" + ch);

        // 2. 查询字符串是否以某个字符串结束
        String suffix = "wxyz";
        System.out.println("字符串 " + str + " 是否以 " + suffix + " 结束：" + str.endsWith(suffix));
        suffix = "abc";
        System.out.println("字符串 " + str + " 是否以 " + suffix + " 结束：" + str.endsWith(suffix));

        // 3. 查询字符串是否以某个字符串开始
        String prefix = "abc";
        System.out.println("字符串 " + str + " 是否以 " + prefix + " 开始：" + str.startsWith(prefix));
        prefix = "adb";
        System.out.println("字符串 " + str + " 是否以 " + prefix + " 开始：" + str.startsWith(prefix));

        // 4. 从 offset 查询开始查询字符串是不是以某个字符串开始
        prefix = "def";
        System.out.println("从索引 3 开始字符串 " + str + " 是否以 " + prefix + " 开始：" + str.startsWith(prefix, 3));

        // 5. 查询字符串是否为空
        System.out.println("字符串 " + str + " 是否为空：" + str.isEmpty());

        // 6. 查询字符串的长度
        System.out.println("字符串 " + str + " 的长度为：" + str.length());

        // 7. 查询字符串的 hashcode
        System.out.println("字符串 " + str + " 的 hashcode：" + str.hashCode());

        // 8. 查询指定字符在字符串中第一次出现的索引
        System.out.println("d 在 " + str + "中第一次出现的索引：" + str.indexOf('d'));

        // ==================================比较字符串=========================================
        // 1. 按照字典顺序比较两个字符串 >0 大于， <0 小于，==0 等于
        String str1 = "hello";
        str2 = "HELLO";
        int res = str1.compareTo(str2);
        System.out.println(str1 + " 与 " + str2 + " 的比较结果：" + res);

        //1. 按照字典顺序比较两个字符串，忽略大小写
        res = str1.compareToIgnoreCase(str2);
        System.out.println("在忽略大小写的情况下，" + str1 + " 与 " + str2 + " 的比较结果：" + res);


        // =====================================拼接字符串=================================================
        // 1. 将另一个字符串拼接到该字符串的末尾
        String str3 = str1.concat(str2);
        System.out.println("拼接字符串 " + str1 + " 和 " + str2 + " 得到 " + str3);

    }
}
