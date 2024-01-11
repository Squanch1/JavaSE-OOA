package com.itheima.lambda.test1;

import com.itheima.lambda.Swim;

public class SwimDemo implements Swim {
    @Override
    public void eat() {
        Swim.super.eat();
    }

    @Override
    public void swim() {

    }

}
