package cn.ecjtuit.day25.demo01.Final;

public class Zi extends Fu {
    /*@Override
    public void method() {

    }*/

    @Override
    public void methodAbs() {

    }

    //错误写法！不能覆盖重写父类当中的final方法
    /*@Override
    public void method() {
        System.out.println("子类覆盖重写父类的方法！");
    }*/
}
