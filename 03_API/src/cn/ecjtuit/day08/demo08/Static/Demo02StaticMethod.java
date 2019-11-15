package cn.ecjtuit.day08.demo08.Static;
/*
* 一旦使用了static修饰成员方法，那么这就成了静态方法。静态方法不属于对象，而是属于类。
*
* 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
* 如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它。
*
* 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法()
*
* 注意事项：
* 1.静态只能访问静态，不能直接访问非静态
* 原因:因为内存当中是先有的静态内容，后有的非静态内容。
* 2.静态方法当中不能用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以通过类名称来调用
        obj.methodStatic();//正确，不推荐，这种写法在编译之后也会被javac翻译成为”类名称.静态方法名“
        MyClass.methodStatic();//正确，推荐

        //对于本类的当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效
    }

    public static void myMethod() {
        System.out.println("自己的方法！");
    }
}