package cn.ecjtuit.day25.demo08;

import java.util.ArrayList;
import java.util.List;
/*
* java.util.List正是ArrayList所实现的接口
* */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，也就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("马坤1");
        list.add("马坤2");
        return list;
    }
}
