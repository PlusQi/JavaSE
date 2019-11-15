package cn.ecjtuit.day42.demo03.Generic;
/*
* 测试含有泛型的方法
* */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();

        /*
        * 调用含有泛型的方法method01
        * 传递什么类型，泛型就是什么类型
        * */
        gm.method1(10);
        gm.method1("abc");
        gm.method1(1.1);
        gm.method1(true);

        gm.method2("静态方法，不建议创建对象使用");

        //静态方法，通过类名.方法名(参数)可以直接使用
        GenericMethod.method2("静态方法");
        GenericMethod.method2(1);
    }
}
