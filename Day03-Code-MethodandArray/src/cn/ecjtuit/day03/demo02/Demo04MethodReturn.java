package cn.ecjtuit.day03.demo02;
/*
* 题目要求：定义一个方法，用来求出两个数字之和。
*
* 注意事项：
* 对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用。
* 但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用
* */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //main方法调用getSum方法
        //调用方法计算完后将结果赋给num
        int num = getSum(1, 2);
        System.out.println("返回值是：" + num);
        System.out.println("========");

        System.out.println(getSum(1, 2));//打印调用
        System.out.println("=======");

        getSum(1, 2);//单独调用，但无返回值
        System.out.println("=======");

        getSum2(2, 3);
    }
    //返回值为int 谁调用getSum,就把结果传给谁
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    //无返回值，计算完直接打印
    public  static void getSum2(int a, int b){
        int result2 = a + b;
        System.out.println("结果是：" + result2);
    }
}
