package com.itheima.abstractclass_method.test1;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("sheep are eating grass");

    }
}
