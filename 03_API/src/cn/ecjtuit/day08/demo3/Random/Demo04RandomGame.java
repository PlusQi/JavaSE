package cn.ecjtuit.day08.demo3.Random;

import java.util.Random;
import java.util.Scanner;

/*
* 题目：
* 用代码模拟猜数字的小游戏
*
* 思路：
* 1.首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
* 2.需要键盘输入，所以用到了Scanner
* 3.获取键盘输入的数字，用Scanner当中的nextInt方法
* 4.已经的到了两个数字，判断(if)一下
*   如果太大了，提示太大，并且重试
*   如果太小了，提示太小，并且充实
*   如果猜中了，游戏结束
* 5.重试就是再来一次，循环次数不确定，用while(true)
* * */
public class Demo04RandomGame {
    public static void main(String[] args) {
        int n = 100;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int result = r.nextInt(n) + 1;

        System.out.println("请输入");
        while (true) {
            int guess = sc.nextInt();
            if(guess > result) {
                System.out.println("大了，再猜");
            }
            else if(guess < result){
                System.out.println("小了，再猜");
            }
            else {
                System.out.println("猜对");
                break;//
            }

        }
        System.out.println("游戏结束");
    }
}
