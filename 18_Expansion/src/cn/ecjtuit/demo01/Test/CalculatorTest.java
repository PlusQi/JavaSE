package cn.ecjtuit.demo01.Test;

import cn.ecjtuit.demo01.Junit.Calculator;
import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    /*
    * 测试add方法
    * */
    @Test
    public void testAdd() {
//        System.out.println("执行");
        //1.创建Calculator对象
        Calculator c = new Calculator();
        //2.调用add方法
        int result = c.add(1, 2);
//        System.out.println(result);

        //3.断言 断言结果为3
        Assert.assertEquals(3, result);
    }

    /*
    * 测试sub方法
    * */
    @Test
    public void testSub() {
//        System.out.println("执行");
        //1.创建Calculator对象
        Calculator c = new Calculator();
        //2.调用add方法
        int result = c.sub(1, 2);
//        System.out.println(result);

        //3.断言 断言结果为3
        Assert.assertEquals(-1, result);
    }
}
