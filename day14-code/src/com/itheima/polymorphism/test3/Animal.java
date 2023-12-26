package com.itheima.polymorphism.test3;
//IDEA真的离谱,居然还分析中文语法,牛


public abstract class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
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
    public abstract void eat(String something);
    public final void drink(){
        System.out.println("喝水");
    }

}
