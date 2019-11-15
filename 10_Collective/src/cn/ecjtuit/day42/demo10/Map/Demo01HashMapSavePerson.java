package cn.ecjtuit.day42.demo10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* HashMap存储自定义类型键值
* Map集合保证key是唯一的：
*      作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
* */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("========");
        show02();
    }

    /*
    * HashMap存储自定义类型键值
    * key：Person类型
    *      Person类就必须重写hashCode方法和equals方法，以保证key唯一
    * value：String类型
    *      可以重复
    * */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("马坤1", 20), "北京");
        map.put(new Person("马坤2", 21), "上海");
        map.put(new Person("马坤3", 22), "广州");
        map.put(new Person("马坤1", 20), "深圳");
        //使用entrySet和增强for循环遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
    }


    /*
    * HashMap存储自定义类型键值
    * key:String类型
    *   String类重写hashCode方法和equals方法，可以保证key唯一
    * value：Person类型
    *   value可以重复(同名同年龄的人视为同一个)
    * */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("北京", new Person("马坤1", 20));
        map.put("上海", new Person("马坤2", 21));
        map.put("广州", new Person("马坤3", 22));
        map.put("北京", new Person("马坤4", 20));

        //使用keySet加增强for遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}
