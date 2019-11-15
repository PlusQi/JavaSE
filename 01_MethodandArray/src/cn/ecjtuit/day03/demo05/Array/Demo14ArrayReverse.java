package cn.ecjtuit.day03.demo05.Array;
/*
* 元素的反转：
* {1 , 2, 3, 4, 5}反转为：{5，4，3，2，1}
* */
public class Demo14ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5,};
        int[] arrayB = {1, 2, 3, 4, 5,};
        /*int[] arrayB = new int[5];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[arrayA.length - (i + 1)] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }*/
        //不使用新数组
        int bootle;
        for (int i = 0; i < arrayA.length / 2; i++) {
            bootle = arrayA[i];
            arrayA[i] = arrayA[arrayA.length - (i + 1)];
            arrayA[arrayA.length - (i + 1)] = bootle;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        System.out.println("===========");
        /*
        * 初始化语句：int min = 0, max = arrayB.length - 1
        * 条件判断：min < max
        * 步进表达式：min++, max++
        * 循环体：用第三个变量倒手
        * */
        for(int min = 0, max = arrayB.length - 1;min < max;min++,max--){
            int temp = arrayB[min];
            arrayB[min] = arrayB[max];
            arrayB[max] = temp;
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }
}
