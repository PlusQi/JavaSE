package cn.ecjtuit.day80.demo08.BufferedStream;
/*
* java.io.BufferedWriter extends Writer
* BufferedWriter: 字符缓冲输出流
* 继承自父类的共性成员方法
*   void write(int c) 写入单个字符
*   void write(char[] cbuf) 写入字符数组
*   abstract void write(char[] cbuf, int off, int len)写入字符数组的某一部分，off：数组的开始索引，len：写的字符个数
*   void write(String str)写入字符串
*   void write(String str, int off, int len) 写入字符的某一部分，off：字符串开始的索引，len：写的字符个数
*   void flush() 刷新该流的缓冲
*   void close() 关闭此流，但要先刷新它
*
* 构造方法：
*   BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
*   BufferedWriter(Writer out, int sz) 创建一个使用给定大小输出缓冲区的新缓冲字符输出流
*   参数：
*       Writer out: 字符输出流
*           可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
*       int sz：指定缓冲区的大小，不写默认大小
*
* */
public class Demo03BufferedWriter {
}
