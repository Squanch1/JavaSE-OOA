package com.itheima.mycolleciton;

import java.io.StringReader;
import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

/**
 * 不依赖索引的三种遍历集合方式.
 * 1.Iterator(单列集合的迭代器),迭代器中无法用集合的增加和删除方法.如果用报错ConcurrentModifiedException(并发修改异常)
 * 2.enhanced for(底层是用的Iterator,所以只能遍历只能对集合中的单列集合)(还可以用增强for循环遍历数组),只能遍历,无法修改集合或者数组内容
 * 3.forEach方法,搭配lambda表达式遍历集合
 * (该方法是Iterable接口的默认方法,单列集合顶层接口Collection是它的子接口,所以单列集合都可用forEach方法遍历集合,但是底层实现可能有区别,有索引用普通for,无索引用enhanced for.Map没有继承这个接口)
 * */
public class A01_CollectionDemo1 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        //1. Iterator(迭代器遍历方式)
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("-------------------------------------------------------------");
        //2. enhanced for 遍历(对迭代器的简化形式,底层用的就是迭代器)
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------------");
        //3. forEach方法搭配lambda表达式,完成遍历.forEach方法底层根据是否有索引使用normal for和enhanced for遍历
        list.forEach(s -> System.out.println(s));
         
        System.out.println("-------------------------------------------------------------");
        //4. 普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        //5.List集合特有的列表迭代器ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next);
        }



    }



}
