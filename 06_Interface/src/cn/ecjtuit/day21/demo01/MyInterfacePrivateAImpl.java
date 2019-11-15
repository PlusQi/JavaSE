package cn.ecjtuit.day21.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        //直接访问到接口中的默认方法，这样是错误的
//        methodCommon();
    }
}
