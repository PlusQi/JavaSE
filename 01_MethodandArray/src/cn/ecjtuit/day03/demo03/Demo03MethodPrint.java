package cn.ecjtuit.day03.demo03;
/*
* 题目要求：
* 定义一个方法，用来打印指定次数的HelloWorld
* */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    /*
    * 三要素
    * 返回值类型：
    * 方法名称：printCount
    * 参数列表: 打印次数 int
    * */
    public static void printCount(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}
