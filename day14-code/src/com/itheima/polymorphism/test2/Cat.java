package com.itheima.polymorphism.test2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
