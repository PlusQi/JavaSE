package cn.ecjtuit.day05.demo03;
/*
* 对于基本类型当中的boolean值，Getter方法一定要写出isXxx的形式，而setXxx规则不变。
* */
public class Student {
    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是男的

    public void setMale(boolean m) {
        male = m;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
