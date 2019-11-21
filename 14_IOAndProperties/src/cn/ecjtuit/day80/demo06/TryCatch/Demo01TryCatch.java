package cn.ecjtuit.day80.demo06.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*
* 在jdk1.7之前使用try catch finally处理流中的异常
* 格式：
*   try{
*       可能会产出异常的代码
*   }catch(异常类变量 变量名){
*       异常处理的逻辑
*   }finally{
*       一定会执行的代码
*       资源释放
*   }
* */
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        //fw = new FileWriter("W:\\Documents\\DeskTop\\g.txt", true");执行失败，fw没有值，fw.close会报错
        FileWriter fw = null;
        try {
            //可能会产生异常的代码
            fw = new FileWriter("W:\\Documents\\DeskTop\\g.txt", true);
            for (int i = 0; i < 10; i++) {
                System.out.println("helloworld" + i + "\r\n");
            }
        }catch (IOException e){
            //异常的处理逻辑
            e.printStackTrace();
        }finally {
            //一定会执行的代码
            //创建对象失败了，fw的默认值就是null，null是不能调用方法的，会抛出NullPointerException
            if (fw != null) {
                try {
                    //fw.close方法声明抛出了IOException异常对象，所以就要处理这个异常对象，要么throws，要么trycatch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
