package cn.ecjtuit.day93.demo03.Stream;

import java.util.ArrayList;

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
public class Demo01StreamTest {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> st = new ArrayList<>();
        st.add("张三");
        st.add("李四");
        st.add("赵六");
        st.add("王老五");
        st.add("张二麻子");
        //1.第一个队伍只要名字为2个字的成员姓名，存储到一个新集合
        ArrayList<String> st1 = new ArrayList<>();
        for (String name1 : st) {
            if (name1.length() == 2){
                st1.add(name1);
            }
        }
        //2.第一个队伍筛选之后只要前2个人，存储到一个新集合中
        ArrayList<String> st2 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            st2.add(st1.get(i));//0,1
        }

        //第二支队伍
        ArrayList<String> nd = new ArrayList<>();
        nd.add("马坤");
        nd.add("坤1");
        nd.add("马");
        nd.add("马坤3");
        nd.add("坤马");
        //3.第二个队伍只要姓马的成员姓名，存储到一个新集合中
        ArrayList<String> nd1 = new ArrayList<>();
        for (String name2 : nd) {
            if (name2.startsWith("马")){
                nd1.add(name2);
            }
        }
        //4.第二个队伍筛选之后不要前2个人，存储到一个新集合中
        ArrayList<String> nd2 = new ArrayList<>();
        for (int i = 2; i < nd1.size(); i++) {
            nd2.add(nd1.get(i));// i 不包含 0 1
        }

        //5.将两个队伍合并成为一个新队伍，存储到一个新集合中
        ArrayList<String> all = new ArrayList<>();
        all.addAll(st2);
        all.addAll(nd2);

        //6.根据姓名创建Person对象，存储到一个新集合中
        ArrayList<Person> list = new ArrayList<>();
        for (String name : all) {
            list.add(new Person(name));
        }

        //7.打印整个队伍的Person对象信息
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
