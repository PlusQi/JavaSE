package cn.ecjtuit.day05.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "三星";
        one.price = 8599.0;
        one.color = "黑";

        method(one);
    }
    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
