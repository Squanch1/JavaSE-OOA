package com.itheima.polymorphism.test1;

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
    public void keepPet(Dog dog,String something){
        System.out.printf("年龄为%d的%s养了一只%S颜色的%d岁的狗",getAge(),getName(),dog.getColor(),dog.getAge());
        System.out.println();
        System.out.printf("%d岁的%s颜色的狗前腿紧紧抱住%s猛吃",dog.getAge(),dog.getColor(),something);
        System.out.println();
    }
    public void keepPet(Cat cat,String something){
        System.out.println();

    }
}
