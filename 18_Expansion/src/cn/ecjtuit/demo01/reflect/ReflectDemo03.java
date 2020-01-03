package cn.ecjtuit.demo01.reflect;

import cn.ecjtuit.demo01.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //1.获取Person的Class对象
        Class personClass = Person.class;

        //Constructor<T> getConstructor(类<?>...parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("马坤", 23);
        System.out.println(person);

        System.out.println("------------");

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

    }
}
