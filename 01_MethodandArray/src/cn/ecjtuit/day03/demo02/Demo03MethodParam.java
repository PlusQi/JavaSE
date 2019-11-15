package cn.ecjtuit.day03.demo02;
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务，就是有参数
无参数：小括号当中留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。

* */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(2, 3);
        method2();
    }
    //两个数字相乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    //有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    //无参数
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("无参数 " + i);
        }
    }
}
