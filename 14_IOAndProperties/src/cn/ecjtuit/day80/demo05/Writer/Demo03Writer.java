package cn.ecjtuit.day80.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
* 字符输出流写数据的其他方法
*   void write(char[] cbuf)写入字符数组
*   abstract void write(char[] cbuf, int off, int len)写入字符数组的某一部分，off: 数组的开始索引，len: 写的字符个数
*   void write(String str)写入字符串
*   void write(String str, int off, int len)写入字符串的某一部分，off: 字符串开始的索引，len：写的字符个数
* */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Documents\\DeskTop\\f.txt");
        char[] cs = {'a', 'b', 'c'};
        //void write(char[] cbuf)写入字符数组
        fw.write(cs);
        //void write(char[] cbuf, int off, int len)写入字符数组的某一部分，off：数组的开始索引，len：写的字符个数
        fw.write(cs, 1, 1);//b

        //void write(String str)写入字符串
        fw.write("马坤");

        //void write(String str, int off, int len) 写入字符串的某一部分，off：字符串开始的索引，len：写的字符个数
        fw.write("一二三四五", 2, 3);//三四五

        fw.close();
    }
}
