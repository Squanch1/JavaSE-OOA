package com.itheima.lambda;
@FunctionalInterface
public interface Swim {
    public static final int a=10;
    public default void eat(){
        System.out.println("小动物在吃东西");
    }
    boolean equals(Object object);
    public abstract void swim();

}
