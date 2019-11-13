package cn.ecjtuit.day05.demo02;

public class Demo03PhoneSame {
    public static void main(String[] args) {
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
        System.out.println("==========");

        Phone two = one;
        System.out.println(two.brand);//
        System.out.println(two.price);//
        System.out.println(two.color);//
        System.out.println("=================");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "白";
        System.out.println(two.brand);//三星
        System.out.println(two.price);//5999.0
        System.out.println(two.color);//白
        System.out.println("================");

        two.call("外地同学02");
        two.sendMessage();
    }
}
