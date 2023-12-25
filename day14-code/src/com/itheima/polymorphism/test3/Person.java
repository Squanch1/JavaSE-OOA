package com.itheima.polymorphism.test3;
//这些都是JavaBean类,是抽象的类,这些代码都不会直接执行,需要到测试类中执行.这就是面向对象的特性.
//在设计类的时候使用多态,而不是在测试类的时候穿多态.
//因为封装的实现,我们在使用的时候根本意识不到底层的代码如何实现的.

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //多态
    //吃东西的行为已经在动物本类中实现了,我们直接调用就行,这就是封装的好处!
    //狠狠地体会封装带来的好处!
    //饲样宠物的方法可以封装在人这个类中
    public void feedPet(Animal a,String something){
        //如果不需要使用子类独有的方法,就不需要对子类强转成父类,直接用父类的引用就行
        //因为多态的特性:运行时成员方法方法看子类虚方法表,其中如果方法重写,就执行子类方法.
        //成员变量看从父类继承过来的成员
        if (a instanceof Dog dog){
            System.out.printf("年龄为%d的%s养了一只%S颜色的%d岁的狗",getAge(),getName(),a.getColor(),a.getAge());
            System.out.println();
            dog.lookHome();
            dog.eat("骨头");
        } else if (a instanceof Cat cat) {
            System.out.printf("年龄为%d的%s养了一只%S颜色的%d岁的猫",getAge(),getName(),a.getColor(),a.getAge());
            System.out.println();
            cat.catchMouse();
            a.eat("骨头");
        }else {
            System.out.println("没有这个类型,转换失败");
        }

    }
}
