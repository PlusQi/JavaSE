package cn.ecjtuit.day76.demo01.File;

import java.io.File;
import java.io.IOException;

/*
* File类创建删除功能的方法
*   public boolean createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹
*   public boolean delete():删除由此File表示的文件或目录
*   public boolean mkdir():创建由此File表示的目录
*   public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的目录
* */
public class Demo05File {
    public static void main(String[] args) throws IOException {
        show01();
        System.out.println("===============");
        show02();
        System.out.println("================");
        show03();
    }

    /*
    * public boolean delete(): 删除由此File表示的文件或目录
    * 此方法，可以删除构造方法路径中给出的文件/文件夹
    * 返回值：布尔值
    *   true：文件/文件夹删除成功，返回true
    *   false：文件夹中有内容，不会删除返回false；构造方法中路径不存在false
    * 注意：
    *   delete方法是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
    * */
    private static void show03() {
        File f1 = new File("D:\\Documents\\Desktop\\123");
        System.out.println(f1.delete());//true

        File f2 = new File("D:\\Documents\\Desktop\\1");
        System.out.println(f2.delete());//false 文件夹中有内容不删除
    }

    /*
    * public boolean mkdir(): 创建单级文件夹
    * public boolean mkdirs():既可以创建单极空文件夹，也可以创建多级文件夹
    * 创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
    * 返回值：布尔值
    *   true：文件夹不存在，创建文件夹，返回true
    *   false：文件夹存在，不会创建，返回false；构造方法中给出的路径不存在返回false
    * 注意：
    *   1.此方法只能创建文件夹，不能创建文件
    * */
    private static void show02() {
        File f1 = new File("D:\\Documents\\Desktop\\123");
        boolean b1 = f1.mkdir();
        System.out.println("b1:" + b1);//true

        File f2 = new File("D:\\Documents\\Desktop\\1\\2\\3");
        System.out.println(f2.mkdirs());//true

        File f3 = new File("D:\\Documents\\Desktop\\a.txt");
        System.out.println(f3.mkdirs());//true 创建的还是文件夹

        File f4 = new File("Desktop\\b");
        System.out.println(f4.mkdirs());//true 路径不存在不会创建文件夹 不会抛出异常
    }

    /*
    * public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的文件夹
    * 创建文件的路径和名称在构造方法中给出(构造方法的参数)
    * 返回值：布尔值
    *   true：文件不存在，创建文件，返回true
    *   false：文件存在，不会创建，返回false
    * 注意：
    *   1.此方法只能创建文件，不能创建文件夹
    *   2.创建文件的路径必须存在，否则会抛出异常
    *   public boolean createNewFile() throws IOException
    *   createNewFile声明抛出了IOException，调用这个方法，就必须得处理这个异常，要么throws，要么trycatch
    * */
    private static void show01() throws IOException {
        File f1 = new File("D:\\Documents\\Desktop\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:" + b1);//true

        /*File f2 = new File("Desktop\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2:" + b2);//java.io.IOException*/
    }
}
