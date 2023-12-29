package com.itheima.interfacepolymorphism;

public class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println(Swim.AGE);
    }

}
