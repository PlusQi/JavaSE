package cn.ecjtuit.day93.demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
* 使用传统的方式，遍历集合，对集合中的数据进行过滤
* */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合，存储姓名
        List<String> list =  new ArrayList<>();
        list.add("马坤0");
        list.add("马坤1");
        list.add("马2");
        list.add("张三");
        list.add("李四");

        //对List集合中的元素进行过滤，只要以马开头的元素，存储到一个新的集合中
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("马")){
                list1.add(s);
            }
        }

        //对list1集合进行过滤，只要姓名长度为3的人，存储到一个新集合中
        List<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.length() == 3){
                list2.add(s);
            }
        }

        //遍历list2集合
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
