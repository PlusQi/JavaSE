package cn.ecjtuit.day08.demo04.ArrayList;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("马坤");
        list.add("马坤2");
        list.add("马坤3");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
