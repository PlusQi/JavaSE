package cn.ecjtuit.day03.demo04;
/*
* byte short int long floot double char boolean*/
public class Demo04OverLoadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("hello");
    }
    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean is) {
        System.out.println(is);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }
}
