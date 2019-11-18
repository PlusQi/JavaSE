package cn.ecjtuit.day76.demo02.Recursion;
/*
* 练习：
*   使用递归计算阶乘
*   n的阶乘：n！= n * (n-1) * ... * 3 * 2 * 1
* */
public class Demo03Recursion {
    public static void main(String[] args) {
        int x = jc(5);
        System.out.println(x);
    }

    /*
    * 定义方法使用递归计算5的阶乘
    * 递归结束条件
    *   获取到1的时候结束
    * 递归的目的
    *   获取下一个被乘的数字(n-1)
    * 方法的参数发生了变化
    * */
    public static int jc(int n){
        //获取到1的时候结束
        if (n == 1){
            return 1;
        }

        return n * jc(n - 1);
    }
}
