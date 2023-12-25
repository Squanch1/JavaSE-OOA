package com.itheima.extendstest.a03extendstest3;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepDog(Dog dog,String something){
        System.out.printf("颜色为%S的%d岁的狗,在吃%s",dog.getColor(),dog.getAge(),something);
        System.out.println();
    }
    public void keepCat(Cat cat,String something){
        System.out.printf("颜色为%S的%d岁的猫,在吃%s",cat.getColor(),cat.getAge(),something);
        System.out.println();
    }
}
