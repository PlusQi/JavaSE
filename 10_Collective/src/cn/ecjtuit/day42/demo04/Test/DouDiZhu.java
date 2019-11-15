package cn.ecjtuit.day42.demo04.Test;

import java.util.ArrayList;
import java.util.Collections;

/*
* 斗地主发牌案例：
*   1.准备牌
*   2.洗牌
*   3.发牌
*   4.看牌
* */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //先把大小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers ={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //循环嵌套遍历两个数组
        for (String color : colors) {
            for (String number : numbers) {
                //把组装好的牌存储到poker集合中
                poker.add(color + number);
                //System.out.println(color + number);
            }
        }
        System.out.println(poker);

        /*
        * 2.洗牌
        * 使用集合的工具类Collections中的方法
        * static void shuffile(list<?> list) 使用默认随机源对指定列表进行置换
        * */
        Collections.shuffle(poker);
        System.out.println(poker);

        /*
        *3.发牌
        * */
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /*
        * 遍历集合，获取每一张牌
        * 使用poker集合的索引%3给3个玩家轮流发牌
        * 剩余三张牌给底牌
        * 注意：
        *   先判断(i >= 51),否则牌就发没了
        * */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if (i >= 51) {
                //给底牌发牌
                diPai.add(p);
            }
            else if (i % 3 == 0) {
                //给player01发牌
                player01.add(p);
            }
            else if (i % 3 == 1) {
                //给player02发牌
                player02.add(p);
            }
            else if (i % 3 == 2) {
                //给player03发牌
                player03.add(p);
            }


        }
        /*
         * 4.看牌
         * */
        System.out.println("玩家1:" + player01);
        System.out.println("玩家2:" + player02);
        System.out.println("玩家3:" + player03);
        System.out.println("底牌:" + diPai);
    }
}
