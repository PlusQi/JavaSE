package cn.ecjtuit.day42.demo09.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下：
*   public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
*
* 注意：
*   sort(List<T> list)使用前提
*   被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法CompareTo定义排序的规则
*
* Comparable接口的排序规则：
*   this(自己) - 参数 ：升序
*   参数 - this ：降序
* */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);//[1, 3, 2]

        //public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
        Collections.sort(list01);//默认是升序
        System.out.println(list01);//[1, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);//[a, c, b]

        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("马坤1", 22));
        list03.add(new Person("马坤", 21));
        list03.add(new Person("马坤2", 23));
        System.out.println(list03);//[Person{name='马坤', age=21}, Person{name='马坤1', age=22}, Person{name='马坤2', age=23}]

        Collections.sort(list03);
        System.out.println(list03);

    }
}
