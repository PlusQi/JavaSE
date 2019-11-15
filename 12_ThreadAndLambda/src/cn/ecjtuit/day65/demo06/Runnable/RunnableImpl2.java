package cn.ecjtuit.day65.demo06.Runnable;
//1.创建要给Runnable接口的实现类
public class RunnableImpl2 implements Runnable{
    //2.在实现类中重写Runnable接口的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("helloworld" + i);
        }
    }
}
