package cn.ecjtuit.day76.demo02.Recursion;

import java.io.File;

/*
* 练习：
*   递归打印多级目录
* 需求：
*   遍历D:\Example\Basic-Code\13_FileAndRecursion\src\cn\ecjtuit\day76\demo01\File文件夹，及其子文件夹
*   只要.java结尾的文件
* */
public class Demo05Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\Example\\Basic-Code\\13_FileAndRecursion\\src\\cn\\ecjtuit\\day76\\demo01\\File");
        getAllFile(file);
    }

    /*
    * 定义一个方法，参数传递File类型的目录
    * 方法中对目录进行遍历
    * */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            //System.out.println(dir);//打印被遍历的目录名称
            //对遍历得到的File对象file进行判断，判断是否是文件夹
            if (file.isDirectory()){
                //file是一个文件夹，则继续遍历这个文件夹
                //发现getAllFile方法就是传递文件夹，遍历文件夹的方法
                //所以直接调用getAllFile方法即可：递归(自己调用自己)
                getAllFile(file);
            } else {
                //file对象是一个文件，直接打印即可
                /*
                * 只要.java结尾的文件
                * */

                /*//1.把File对象file转为字符串对象
//                String name = file.getName();
//                String path = file.getPath();
                String string = file.toString();

                //如果不区分大小写，可以把字符串统一转换为小写
                string = string.toLowerCase();

                //2.调用String类中的方法endsWith判断字符串是否是以.java结尾
                boolean b = string.endsWith(".java");

                //3.如果是以.java结尾的文件，则输出
                if (b){
                    System.out.println(file);
                }*/

                //简化代码
                if (file.toString().toLowerCase().endsWith(".java")) {
                    System.out.println(file);
                }
            }
        }
    }
}
