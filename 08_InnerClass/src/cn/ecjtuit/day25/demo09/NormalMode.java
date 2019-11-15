package cn.ecjtuit.day25.demo09;

import cn.ecjtuit.day25.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;//平均值
        int mod = totalMoney % totalCount;//余数，零头

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(i);
        }

        //有零头，需要放在最后一个红包当中
        list.add(avg + mod);

        return list;
    }
}
