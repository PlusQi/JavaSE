package cn.ecjtuit.day08.demo01.Scanner;

import java.util.Scanner;

/*
* 题目：键盘输入三个int数字，然后求出其中的最大值
*
* 思路：
* 1.既然是键盘输入，肯定要用到Scanner
* 2.Scanner三个步骤：导包，创建，使用nextInt()方法
* 3.既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
* 4.比较
* 5.打印最终结果
* */
public class Demo03ScannerMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < 3; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
