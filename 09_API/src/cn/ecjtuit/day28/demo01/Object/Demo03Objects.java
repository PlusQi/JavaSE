package cn.ecjtuit.day28.demo01.Object;
import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        //String s1 = "ABC";
        String s1 = null;
        String s2 = "abc";
        /*boolean b = s1.equals(s2);//NullPointerException null 是不能调用方法的，就会抛出空指针异常
        System.out.println(b);*/
        /*
        * Object类的equals方法：对两个对象进行比较防止空指针异常
        * public static boolean equals(Object a, Object b) {
        *   return (a == b) || (a != null && a.equals(b));
        * }
        * */

        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);
    }
}
