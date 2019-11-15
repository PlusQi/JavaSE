package cn.ecjtuit.day05.demo01;

import java.util.Arrays;

/*
* 面向过程：当需要实现一个功能的时候，每一个具体的步骤都需要亲力亲为，详细处理每一个细节
* 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //要求打印格式：[1, 2, 3, 4, 5]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                System.out.println(array[i] + "]");
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("================");
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
