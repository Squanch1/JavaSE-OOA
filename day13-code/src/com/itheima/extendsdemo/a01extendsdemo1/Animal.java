package com.itheima.extendsdemo.a01extendsdemo1;
/**
 * Java中继承只允许单继承,即一个类只能有一个父类,不允许多继承.允许多层继承,即不管你的父类是否还有父类,都可以继承.
 * 于是就有了直接父类,和间接父类这样的概念.
 * 平时说的父类都是直接父类.
 * Java中所有的类都直接或间接继承于Object这个类.如果一个类没有父类,那么该类就默认继承于Object类(虚拟机就会默认添加一个extends Object).反之则没有.
 * */
public class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }
}
