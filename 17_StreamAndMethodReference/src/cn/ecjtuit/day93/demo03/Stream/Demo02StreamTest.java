package cn.ecjtuit.day93.demo03.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 练习：集合元素处理(传统方式)
 *   现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环(或增强for循环)一次进行以下若干操作步骤：
 *       1.第一个队伍只要名字为2个字的成员姓名；存储到一个新集合中
 *       2.第一个队伍筛选之后只要前2个人，存储到一个新集合中
 *       3.第二个队伍只要姓马的成员姓名，存储到一个新集合中
 *       4.第二个队伍筛选之后不要前2个人，存储到一个新集合中
 *       5.将两个队伍合并成为一个队伍，存储到一个新集合中
 *       6.根据姓名创建Person对象，存储到一个新集合中
 *       7.打印整个队伍的Person对象信息
 * */
public class Demo02StreamTest {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> st = new ArrayList<>();
        st.add("张三");
        st.add("李四");
        st.add("赵六");
        st.add("王老五");
        st.add("张二麻子");
        //1.第一个队伍只要名字为2个字的成员姓名，存储到一个新集合
        //2.第一个队伍筛选之后只要前2个人，存储到一个新集合中
        Stream<String> stStream = st.stream().filter(name1 -> name1.length() == 2).limit(2);

        //第二支队伍
        ArrayList<String> nd = new ArrayList<>();
        nd.add("马坤");
        nd.add("坤1");
        nd.add("马");
        nd.add("马坤3");
        nd.add("坤马");
        //3.第二个队伍只要姓马的成员姓名，存储到一个新集合中
        //4.第二个队伍筛选之后不要前2个人，存储到一个新集合中
        Stream<String> ndStream = nd.stream().filter(name2 -> name2.startsWith("马")).skip(2);

        //5.将两个队伍合并成为一个新队伍，存储到一个新集合中
        //6.根据姓名创建Person对象，存储到一个新集合中
        //7.打印整个队伍的Person对象信息
        Stream.concat(stStream, ndStream).map(name -> new Person(name)).forEach(p -> System.out.println(p));
    }
}
