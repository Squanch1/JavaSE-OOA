package com.itheima.polymorphism.test1;

public class Dog {
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String something){
        System.out.println("在吃"+something);
    }
}
