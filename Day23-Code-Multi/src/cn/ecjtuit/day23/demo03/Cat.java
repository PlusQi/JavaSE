package cn.ecjtuit.day23.demo03;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}
