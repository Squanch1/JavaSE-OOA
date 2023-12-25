package com.itheima.staticdemo.a03staticdemo3;

import java.util.ArrayList;

/**
 * 测试类先写main方法
 * */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("张三", 15, "male");
        System.out.println(student1);
        Student student2 = new Student("李四", 18, "male");
        Student student3 = new Student("王五", 25, "male");
        list.add(student1);
        int age = student1.getAge();
        list.add(student2);
        list.add(student3);
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
        System.out.println();
    }
}
