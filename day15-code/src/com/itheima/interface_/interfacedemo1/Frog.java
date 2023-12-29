package com.itheima.interface_.interfacedemo1;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    //对接口内方法的重写
    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }

}
