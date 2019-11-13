package cn.ecjtuit.day42.demo10.Map;

import java.util.HashMap;
import java.util.Map;

/*
* java.util.Map<k, v>集合
* Map集合的特点：
*   1.Map集合是一个双列集合，一个元素包含两个值(一个key, 一个value)
*   2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
*   3.Map集合中的元素，key是不允许重复的，value是可以重复的
*   4.Map集合中的元素，key和value是一一对应
*
* HashMap集合的特点：
*   1.HashMap集合底层是哈希表：查询的速度快
*       JDK1.8之前：数组 + 单向链表
*       JDK1.8之后：数组 + 单向链表/红黑树(链表的长度超过8)：提高查询的速度
*   2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
*
* java.util.LinkedHashMap<k,v>集合 extends HashMap<k, v>集合
* LinkedHashMap的特点：
*   1.LinkedHashMap集合底层是哈希表 + 链表(保证迭代的顺序)
*   2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
* */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
        System.out.println("===========");
        show02();
        System.out.println("===========");
        show03();
        System.out.println("===========");
        show04();
    }

    /*
    * boolean containsKey(Object key) 判断集合中是否包含指定的健
    * 包含返回true，不包含返回false
    * */
    private static void show04() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("马坤a", 1);
        map.put("马坤b", 2);
        map.put("马坤c", 3);

        boolean con1 = map.containsKey("马坤b");
        System.out.println("con1: " + con1);//con1: true

        boolean con2 = map.containsKey("马坤f");
        System.out.println("con2: " + con2);//con2: false
    }

    /*
    * public V get(Object key) 根据指定的健，在Map集合中获取对应的值
    *   返回值：
    *       key存在，返回对应的value值
    *       key不存在，返回null
    * */
    private static void show03() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("马坤a", 1);
        map.put("马坤b", 2);
        map.put("马坤c", 3);

        Integer getB = map.get("马坤b");
        System.out.println("getB: " + getB);//getB: 2
        Integer getN = map.get("马坤n");
        System.out.println("getN: " + getN);//getN: null
    }

    /*
    * public V remove(Object key): 把指定的健 对应的键值对元素 在Map集合中删除，返回被删除元素的值
    *   返回值：V
    *       key存在，v返回被删除的值
    *       key不存在，v返回null
    * */
    private static void show02() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("马坤a", 1);
        map.put("马坤b", 2);
        map.put("马坤c", 3);
        System.out.println(map);//{马坤b=2, 马坤c=3, 马坤a=1}

        Integer remove = map.remove("马坤b");

        //int removeF = map.remove("马坤f");//自动拆箱 NullPointerException
        Integer removeF = map.remove("马坤f");
        System.out.println("removeF: " + removeF);//null

        System.out.println("remove: " + remove);//remove: 2
        System.out.println(map);//{马坤c=3, 马坤a=1}
    }

    /*
     * public V put(K key, V value): 把指定的健与指定的值添加到Map集合中
     *   返回值：v
     *       存储健值对的时候，key不重复，返回值V是null
     *       存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
     * */
    private static void show01() {
        //创建Map对象，多态
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("马坤", "A");
        System.out.println("v1: " + v1);//v1: null

        String v2 = map.put("马坤", "B");
        System.out.println("v2: " + v2);//v2: A

        System.out.println(map);//{马坤=B}

        map.put("马坤1", "a");
        map.put("马坤2", "b");
        map.put("马坤3", "c");
        System.out.println(map);//{马坤2=b, 马坤3=c, 马坤1=a, 马坤=B}
    }
}
