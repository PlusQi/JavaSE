package cn.ecjtuit.day20.demo02;

public class Zi extends Fu {

    public Zi() {
        //super();
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }
}
