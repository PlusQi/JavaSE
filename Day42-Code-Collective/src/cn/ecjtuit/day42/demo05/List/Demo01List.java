package cn.ecjtuit.day42.demo05.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* java.util.List接口 extends Collection接口
* List接口的特点：
*   1.有序的集合，存储元素和取出元素的顺序是一致的
*   2.有索引，包含了一些带索引的方法
*   3.允许存储重复的元素
*
* List接口中带索引的方法(特有)
*   public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置
*   public E get(int index): 返回集合中指定位置的元素
*   public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素
*   public E set(int index, E element): 用指定元素替换集合中指定位置的元素，返回值是被替换的元素
* 注意：
*   操作索引的时候，一定要防止缩影越界异常
*   IndexOutOfBoundsException:索引越界异常，集合会报
*   ArrayIndexOutOfBoundsException：数组索引越界异常
*   StringIndexOutOfBoundsException：字符串索引越界异常
* */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //打印集合
        System.out.println(list);//[A, B, C, D] 不是地址，说明重写了toString方法

        //public void add(int index, E element):将指定的元素，添加到该集合中指定的位置
        //在C和D之间添加马坤
        list.add(3,"马坤");
        System.out.println(list);//[A, B, C, 马坤, D]

        //public E remove(int index): 移除列表中指定位置的元素，返回的是被移除的元素
        //移除元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素是：" + removeE);//被移除的元素是：C
        System.out.println(list);//[A, B, 马坤, D]

        //public E set(int index, E element): 用指定元素替换集合中指定位置的元素，返回值是被替换的元素
        //把D替换为E
        String setE = list.set(3, "E");
        System.out.println("被替换的元素是：" + setE);//被替换的元素是：D
        System.out.println(list);//[A, B, 马坤, E]

        //List集合遍历有3种方式
        //使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("============");

        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=========");

        //使用增强for循环
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===========");


    }

}
