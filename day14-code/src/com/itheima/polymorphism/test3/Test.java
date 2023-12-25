package com.itheima.polymorphism.test3;

//目前可能还没完全领悟面向对象的思想,还要加油
//由于Java是一门面向对象的编程语言,面向对象的三个核心就是封装,继承,多态
//这三个核心都是在设计抽象类的时候用到的,是在设计抽象类里用到的(这个类不包括测试类).
// 切记不是在使用测试类不需要考虑这三个核心,在测试类中需要忘记底层代码的实现,把自己当成用户,调用创建对象,并且调用方法即可.
//如果代码实现有问题,那就去看抽象类的编写.
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Dog dog = new Dog(2, "黑");
        p1.feedPet(dog, "骨头");

        Person p2 = new Person("老李", 25);
        Cat cat = new Cat(3, "灰");
        p2.feedPet(cat, "小鱼干");

    }
}
