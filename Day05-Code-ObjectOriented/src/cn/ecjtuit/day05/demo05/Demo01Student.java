package cn.ecjtuit.day05.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("马坤");
        stu1.setAge(21);
        System.out.println("姓名：" + stu1.getName() + ", 年龄：" + stu1.getAge());
        System.out.println("==============");

        Student stu2 = new Student("马坤",21);
        System.out.println("姓名：" + stu1.getName() + ", 年龄：" + stu1.getAge());
        stu2.setAge(32);
        System.out.println("姓名：" + stu1.getName() + ", 年龄：" + stu1.getAge());

    }
}
