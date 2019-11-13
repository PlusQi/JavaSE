package cn.ecjtuit.day23.demo03;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
