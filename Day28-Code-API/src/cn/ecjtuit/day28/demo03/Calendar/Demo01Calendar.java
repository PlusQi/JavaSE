package cn.ecjtuit.day28.demo03.Calendar;

import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* Canlendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR)
* Canlendar类无法创建对象使用，里边有一个静态方法叫getInstance(),该方法返回了Canlendar类的子类对象
* static Canlendar getInstance()使用默认时区和语言环境获得一个日历
* */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);

    }
}
