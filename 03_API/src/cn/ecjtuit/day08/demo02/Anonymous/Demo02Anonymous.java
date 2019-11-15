package cn.ecjtuit.day08.demo02.Anonymous;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
/*
        //普通使用方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
*/
        /*//匿名对象的方式
        System.out.println("请输入一个数");
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + num);
        */

        /*
        //使用一般方法进行传参
        Scanner sc = new Scanner(System.in);
        methodParam(sc);
        */

        //使用匿名对象进行传参
        //methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的数是：" + num);
    }

    public static void methodParam( Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

    }

    public static Scanner methodReturn() {
        //Scanner sc = new Scanner(System.in);
        //return sc;

        return new Scanner(System.in);
    }
}
