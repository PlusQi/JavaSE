package cn.ecjtuit.day05.demo01;
/*
* 通常情况下：一个类并不能直接使用，需要根据类创建一个对象，才能使用
*
* 1.导包：也就是指出需要使用的类，在什么位置。
* import 包名称.类名称；
* import cn.ecjtuit.day05.demo01.Student
* 对于和当前类属于同一个包的情况，可以省略导包语句不写
*
* 2.创建，格式
* 类名称 对象名 = new 类名称();
* Student stu = new Student();
*
* 3.使用：分为两种情况：
* 使用成员变量：对象名.成员变量名
* 使用成员方法：对象名。成员方法名(参数)
*
* 注意事项：
*
* */
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包
        //我需要使用的Student类，和我自己Demo02Student位于同一个包下，所以省略导包语句不写

        //2.创建，格式
        //类名称 对象名 = new 类名称();
        Student stu = new Student();

        //3.使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("================");

        //改变对象当中的成员变量数值内容
        //将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "马坤";
        stu.age = 21;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("============");

        //4.使用对象的成员方法，格式：
        //对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
