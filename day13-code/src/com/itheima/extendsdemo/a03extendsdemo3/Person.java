package com.itheima.extendsdemo.a03extendsdemo3;

public class Person {
    public String name;
    public String gender;
    public static void staticMethod() {
        System.out.println("我是静态方法");
    }
    public Person() {
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
