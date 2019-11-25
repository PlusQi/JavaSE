package cn.ecjtuit.day80.demo11.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* 把对象以流的方式，写入到文件中保存，叫写对象，也叫对象的序列化
* 把文件中保存的对象，以流的方式读取出来，叫做读对象，也叫对象的反序列化
*
* java.io.ObjectOutputStream extends OutputStream
* ObjectOutputStream: 对象的序列化流
* 作用：把对象以流的方式写入到文件中保存
* 构造方法：
*   1.创建ObjectOutputStream对象，构造方法中传递字节输出流
*   2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
*   3.释放资源
* */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Documents\\DeskTop\\person.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObject，把对象写入到文件中
        oos.writeObject(new Person("马坤", 21));
        //3.释放资源
        oos.close();
    }
}
