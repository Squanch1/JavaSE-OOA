package com.itheima.treeset;

import java.util.TreeSet;
/*
* TreeSet集合会自动对整形和浮点类型(包装类)的数据自动从小到大排序,底层使用的是红黑树的数据结构.
* 在添加对象的时候,集合就会自动排序,如果添加到对象是自定以类型,需要实现Comparable接口.
* */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wang", 25);

        TreeSet<Student> stu = new TreeSet<>();
        stu.add(s1);
        stu.add(s3);
        stu.add(s2);
        stu.add(s4);
        System.out.println(stu);
    }
}
