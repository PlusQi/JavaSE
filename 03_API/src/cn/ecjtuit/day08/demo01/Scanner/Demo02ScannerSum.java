package cn.ecjtuit.day08.demo01.Scanner;
import java.util.Scanner;

/*
* 题目：键盘输入两个int数字，并且求出和值
*
* 思路：
* 1.既然需要键盘输入，那么就用Scanner
* 2.Scanner的三个步骤：导包，创建，使用
* 3.需要的是两个数字，所以要用两次nextInt方法
* 4.得到了两个数字，就需要调用两次nextInt方法
* 5.将结果打印输出
* */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        //2.创建
        Scanner sc = new Scanner(System.in);
        //3.使用
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("和为：" + (num1 + num2));
    }
}
