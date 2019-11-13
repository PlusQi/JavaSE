package cn.ecjtuit.day03.demo05.Array;
/*
* 数组可以作为方法的参数
* 当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值  */
public class Demo15ArrayParam {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array);//地址值
        printArray(array);//传递进去的就是array当中的保存的地址值

    }

    /*
    三要素
    返回值类型：没有结果，用void
    方法名称：printArray
    参数列表：必须给我数组，我才能打印其中的元素，int[] array
    */

    public static void printArray(int[] array){
        System.out.println("printArray方法收到的参数是：");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
            System.out.println(array[i]);
        }
    }
}
