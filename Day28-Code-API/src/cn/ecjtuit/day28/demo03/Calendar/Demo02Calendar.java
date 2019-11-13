package cn.ecjtuit.day28.demo03.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的常用成员方法：
*   public int get(int field):返回给定日历字段的值
*   public void set(int field, int value):将给定的日历字段设置为给定值
*   public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
*   public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
* 成员方法的参数：
*   int field：日历类的字段，可以使用Canlendar类的静态成员变量获取
* */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /*
    * public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
    * 把日历对象，转换为日期对象
    * */
    private static void demo04() {
         //使用getInstace方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }


    /*
    * public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
    * 把指定的字段增加/减少指定的值
    * 参数：
    *   int field：传递指定的日历字段(YEAR,MONTH...)
    *   int amount:增加/减少指定的值
    *   正数：增加
    *   负数：减少
    * */
    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //把年增加2
        c.add(Calendar.YEAR,2);
        //把月份减少3
        c.add(Calendar.MONTH,-2);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份：0-11

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
    * public void set(int field, int value):将给定的日历字段设置为给定值
    * 参数：
    *   int field：传递指定的日历字段(YEAR，MONTH...)
    *   int value:给指定字段设置的值
    * */
    private static void demo02() {
        //使用getInstace方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //设置年为1234
        c.set(Calendar.YEAR,1999);
        //设置月为1
        c.set(Calendar.MONTH,1);
        //设置日为1
        c.set(Calendar.DATE,1);
        //同时设置年月日，可以使用set的重载方法
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份：0-11

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }

    /*
    * public int get(int field):返回给定日历字段的值
    * 参数传递指定的日历字段(YEAR,MONTH....)
    * 返回值：日历字段代表的具体的值
    * */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份：0-11

        //int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
