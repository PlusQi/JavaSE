package cn.ecjtuit.day05.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "马坤";
        //person.age = 21;//直接访问private内容，错误写法
        person.setAge(-20);
        person.show();

        System.out.println(person);
    }
}
