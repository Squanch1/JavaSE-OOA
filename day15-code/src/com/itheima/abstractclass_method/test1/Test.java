package com.itheima.abstractclass_method.test1;

public class Test {
    public static void main(String[] args) {
        //对于JavaBean类来说创建对象是调用其方法的前提,要能成功调用还需要成员方法有足够的访问权限.
        //因为JavaBean类的方法都用public修饰
        //Utility class的静态方法也都是public修饰的,可以用类名替代对象名去调用方法.
        Dog husky = new Dog("husky", 2);
        Frog frog = new Frog("青蛙王子", 20);
        Sheep shawn = new Sheep("shawn", 80);
        husky.eat();
        husky.drink();
        frog.eat();
        shawn.eat();
    }
}
