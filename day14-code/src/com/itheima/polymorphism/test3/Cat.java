package com.itheima.polymorphism.test3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s",getAge(),getColor(),something);
        System.out.println();    }
}
