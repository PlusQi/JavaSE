package cn.ecjtuit.day76.demo01.File;

import java.io.File;

/*
* File类获取功能的方法
*   public String getAbsolutePath(): 返回此File的绝对路径名字符串
*   public String getPath(): 将此File转换为路径名字符串
*   public String getName(): 返回此File表示的文件或目录的名称
*   public long length(): 返回此File表示的文件的长度
* */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        System.out.println("==================");
        show02();
    }

    /*
    * public String getPath(): 将此File转换为路径名字符串
    * 获取的构造方法中传递的路径
    *
    * toString方法调用的就是getPath方法
    * 源码：
    * public String toString() {
    *    return getPath();
    *}
    * */
    private static void show02() {
        File f1 = new File("D:\\Example\\Basic-Code\\13_FileAndRecursion\\2.txt");
        File f2 = new File("2.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);//D:\Example\Basic-Code\13_FileAndRecursion\2.txt
        System.out.println(path2);//2.txt

        System.out.println(f1);//D:\Example\Basic-Code\13_FileAndRecursion\2.txt
        System.out.println(f1.toString());//D:\Example\Basic-Code\13_FileAndRecursion\2.txt
    }

    /*
    * public String getAbsolutePath(): 返回此File的绝对路径名字符串
    * 获取的构造方法中传递的路径
    * 无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
    * */
    private static void show01() {
        File f1 = new File("D:\\Example\\Basic-Code\\13_FileAndRecursion\\1.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\Example\Basic-Code\13_FileAndRecursion\1.txt

        File f2 = new File("1.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\Example\Basic-Code\1.txt

    }
}
