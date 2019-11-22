package cn.ecjtuit.day80.demo09.CopyFile;

import java.io.*;

/*
* 文件复制练习：一读一写
*   明确：
*       数据源：D:\Documents\Desktop\wtf\q.jpg
*       数据目的地：D:\Documents\Desktop\images\q.jpg
* 文件复制的步骤：
*   1.创建字节缓冲输入流对象，构造方法中传递字节输入流
*   2.创建字节缓冲输出流对象，构造方法中传递字节输出流
*   3.使用字节缓冲输入流对象中的方法read，读取文件
*   4.使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区中
*   5.释放资源(会先把缓冲区中的数据，刷新到文件中)
*  文件大小：2,882,508字节
*  一次读写一个字节耗时：195毫秒
*  使用数组缓冲读取多个字节，写入多个字节：10毫秒
* */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        //1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Documents\\Desktop\\wtf\\q.jpg"));

        //2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Documents\\Desktop\\images\\q.jpg"));

        //3.使用字节缓冲输入流对象中的方法read，读取文件
        //一次读取一个字节写入一个字节的方式
        /*int len = 0;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }*/

        //使用缓冲数组读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }

        //4.释放资源
        bos.close();
        bis.close();


        long e = System.currentTimeMillis();
        System.out.println("复制文件耗时：" + (e - s) + "毫秒");
    }
}
