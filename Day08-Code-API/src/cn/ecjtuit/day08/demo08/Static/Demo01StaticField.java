package cn.ecjtuit.day08.demo08.Static;
/*
*如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("马坤",21);
        one.room = "01教室";
        Student two = new Student("马坤2",22);

        System.out.println("姓名：" + one.getName()
                + ", 年龄：" + one.getAge() + ", 教室：" + one.room
                + "，学号：" + one.getId());
        System.out.println("姓名：" + two.getName()
                + ", 年龄：" + two.getAge() + ", 教室：" + two.room
                + "，学号：" + two.getId());
    }
}
