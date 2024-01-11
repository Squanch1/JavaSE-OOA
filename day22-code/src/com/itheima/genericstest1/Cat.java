package com.itheima.genericstest1;

public abstract class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Cat{}";
    }
}
