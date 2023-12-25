package com.itheima.polymorphism.test2;

public class Test {
    public static void main(String[] args) {
        Breeder p1 = new Breeder("老王", 30);
        Breeder p2 = new Breeder("老李", 25);
        Animal a1 = new Dog(3, "黑");
        Animal a2 = new Cat(2, "灰");



    }
}
