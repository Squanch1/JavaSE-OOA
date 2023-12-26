package com.itheima.abstractclass_method.test1;
//先写私有化成员变量,构造方法,成员方法,最后再来重写抽象方法.
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog are eating bones");
    }

}
