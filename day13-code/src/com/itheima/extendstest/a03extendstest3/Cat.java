package com.itheima.extendstest.a03extendstest3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
