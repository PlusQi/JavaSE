package cn.ecjtuit.day03.demo05.Array;
/*
* 如何获取数组的长度：
* 数组名称.length
*
* 这将会得到一个int数字，代表数组长度。
*
* 数组一旦创建，程序运行期间，长度不可改变。
* */
public class Demo11ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {1, 2, 3, 4, 5};
        int len =arrayB.length;
        System.out.println("数组的长度：" + len);
        System.out.println("=========");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);//3
        arrayC = new int[6];
        System.out.println(arrayC.length);//6
    }
}
