package cn.ecjtuit.day03.demo05.Array;

public class Demo13ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];

            }
        }
        System.out.println("最大值是：" + max);
    }
}
