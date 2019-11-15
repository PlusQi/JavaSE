package cn.ecjtuit.day05.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("马坤");
        stu.setAge(21);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是男的：" + stu.isMale());

    }
}
