package cn.ecjtuit.day03.demo05.Array;
/*
* 直接打印数组名称，得到的是数组对应的内存地址哈希值
*
* 访问数组元素的格式：数组名称[索引值]
* 索引值：就是一个int数字，代表数组当中元素的编号。
* 索引值从0开始一直到”数组长度“-1为止
* */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //内存静态初始化的省略模式
        int[] array = {1, 2, 3, 4};
        System.out.println(array);//[I@1540e19d

        System.out.println(array[0]);
    }
}
