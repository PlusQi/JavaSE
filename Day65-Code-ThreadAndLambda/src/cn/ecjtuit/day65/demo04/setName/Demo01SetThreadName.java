package cn.ecjtuit.day65.demo04.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("马坤");
        mt.start();

        //开启多线程
        new MyThread("马坤1").start();
    }
}
