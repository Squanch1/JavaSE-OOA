package com.itheima.interface_.interfacedemo1;

public interface Swim {
    public static final int TEST = 1;

    public abstract void swim();

    //接口里的静态方法只能由接口名调用,不能用实现类的类名,或者实现类的实例对象名去调用
    public static void staticMethod() {
        System.out.println("我是静态方法");
    }
    public default void defaultMethod() {
        System.out.println("我是默认方法");
    }
}
