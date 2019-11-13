package cn.ecjtuit.day03.demo02;
/*
定义格式：
public static void 方法名称(){
    方法体
}
调用格式：
方法名称();

注意事项：
1.方法的定义先后顺序无所谓
2.方法定义必须是挨着的，不能在一个方法的内部调用另一个方法。
3.方法定义之后，自己不会执行的，如果希望执行，一定要进行方法的调用。
*/
public class Demo01Method {
    public static void main(String[] args) {
        prinnMethod();
    }
    public static void prinnMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}