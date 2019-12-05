package cn.ecjtuit.day93.demo02.Stream;

import java.util.stream.Stream;

/*
* Stream流中的常用方法 concat：用于把流组合到一起
* 如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
* static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
* */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("马坤1", "马坤2", "马坤3");
        //获取一个Stream流
        String[] arr = {"张三", "李四", "王五"};
        Stream<String> stream2 = Stream.of(arr);
        //把以上两个流组合为一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat流
        concat.forEach(name -> System.out.println(name));

    }
}
