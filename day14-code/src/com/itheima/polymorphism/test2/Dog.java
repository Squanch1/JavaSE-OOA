package com.itheima.polymorphism.test2;

public class Dog extends Animal{
    public Dog() {
        //子类成员变量在初始化前,要先调用父类构造方法对从父类那里继承来的成员变量初始化
        //隐藏的super();
    }

    public Dog(int age, String color) {
        //子类成员变量在初始化前,要先调用父类构造方法对从父类那里继承来的成员变量初始化
        super(age, color);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }

}
