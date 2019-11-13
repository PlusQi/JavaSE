package cn.ecjtuit.day20.demo04;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("群员A", 0);
        Member two = new Member("群员B", 0);
        Member three = new Member("群员C", 0);

        //显示余额
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============");

        ArrayList<Integer> redList = manager.send(20, 3);
        //三个群员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show(); // 100 - 20 = 80
        // 6、6、8随机分配
        one.show();
        two.show();
        three.show();

    }
}
