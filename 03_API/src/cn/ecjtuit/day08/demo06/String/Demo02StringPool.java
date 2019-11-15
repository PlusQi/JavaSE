package cn.ecjtuit.day08.demo06.String;
/*
* 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
*
* 对于
* */


public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
