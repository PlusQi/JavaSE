package cn.ecjtuit.day21.demo03;
/*
* 这个接口当中有四个方法：
* methodA来源于接口A
* methodB来源于接口B
* methodCommon同时来源于接口A和B
* method来源与我自己
* */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
