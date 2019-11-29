package cn.ecjtuit.day89.demo03.LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/*
* 如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式
* 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，就可以调用该方法获取
* */
public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //字符串降序排序
                return o2.length() - o1.length();
            }
        };*/

        //方法的返回值类型是一个函数式接口，可以返回一个Lambda表达式
        /*return (String o1, String o2) -> {
            //字符串降序排序
            return o2.length() - o1.length();
        };*/

        //优化Lambda表达式
        return (o1, o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        //创建一个字符串数组
        String[] arr = {"aa", "bbb", "ccc"};
        //输出排序前的数组
        System.out.println(Arrays.toString(arr));//[aa, bbb, ccc]
        //调用Arrays中的sort方法，对字符数组进行排序
        Arrays.sort(arr, getComparator());
        //输出排序后的数组
        System.out.println(Arrays.toString(arr));//[bbb, ccc, aa]
    }
}
