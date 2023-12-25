package com.itheima.polymorphism.test3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    //对于父类没有,子类独有的行为和属性中需要在子类中额外添加
    //对于上述添加的成员,多态就无法实现了,需要downCasting(向下转型),然后才能调用子类方法.
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }

    //对于从父类继承下来的方法,如果无法满足子类需求,就要对其重写.
    //重写的方法可以很好实现多态
    @Override
    public void eat(String something) {
        System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s",getAge(),getColor(),something);
        System.out.println();    }
}
