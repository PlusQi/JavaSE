package cn.ecjtuit.day28.demo01.Object;

import java.util.ArrayList;

/*
* Person类默认继承了Object类，所以可以使用Object类的equals方法
* boolean equals(Object obj)指示其他某个对象是否与此对象“相等”
* equals方法源码：
*   public boolean equals(Object obj) {
*       return (this == obj);
* }
* 参数：
*   Object obj：可以传递任意的对象
*   ==比较运算符，返回的是一个布尔值 true false
*   基本数据类型：比较的是值
*   引用数据类型：比较的是两个对象的地址值
*   this：哪个对象调用的方法，方法的this就是哪个对象
*   obj：传递过来的参数
* equals()方法默认比较的是对象的地址值
* */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("马坤1",21);
        Person p2 = new Person("马坤2",22);
        System.out.println("p1地址：" + p1);//p1地址：cn.ecjtuit.day28.demo01.Person@7c30a502
        System.out.println("p2地址：" + p2);//p2地址：cn.ecjtuit.day28.demo01.Person@49e4cb85

//        p1 = p2;//把p2的地址值赋给p1
        ArrayList<Integer> list = new ArrayList<>();

        boolean b = p1.equals(list);
        System.out.println(b);
    }
}
