package cn.ecjtuit.day05.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null
        System.out.println("=================");

        one.brand = "马坤最爱、全世界最好用的苹果";
        one.price = 9998.0;
        one.color = "马坤黑";
        System.out.println(one.brand);//马坤最爱、全世界最好用的苹果
        System.out.println(one.price);//9998.0
        System.out.println(one.color);//马坤黑
        System.out.println("================");

        one.call("外地同学01");
        one.sendMessage();
    }
}
