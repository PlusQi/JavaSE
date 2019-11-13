package cn.ecjtuit.day03.demo05.Array;
/*
* 一个方法可以有0 ，1或多个参数；但是只能有一个返回值
* 如果希望一个方法当中产生了多个结果数据进行返回怎么版
* 解决方法：使用一个数组作为返回值类型即可
*
* 数组作为方法的参数，传递进去的其实是数组的地址值
* 数组作为方法的返回值，返回的其实也是数组的地址值*/
public class Demo16ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(1, 2, 3);
        System.out.println("main方法接收到的返回值：");
        System.out.println(result);

        System.out.println("总和是：" + result[0]);
        System.out.println("平均值：" + result[1]);
    }
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望进行返回
        //需要一个数组，存放多个结果

        /*int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;*/

        int[] array = {sum, avg};
        System.out.println(array);
        return array;
    }
}
