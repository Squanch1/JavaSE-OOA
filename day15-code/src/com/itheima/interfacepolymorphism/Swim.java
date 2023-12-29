package com.itheima.interfacepolymorphism;

public interface Swim {
    //接口中只允许成员变量为常量
    //public static final 是在接口中变量的默认修饰符,但是我们在书写的时候不要省略
    public  static  final int AGE = 0;
    //接口中不允许有构造方法(接口也不能直接创建对象)
//-------------------------------------------------------------------------
    //JDK7及以前只允许在接口中写抽象方法
    public abstract void swim();
    //JDK8新增了默认方法和静态方法来避免接口功能拓展,导致实现类必须重写的弊端
    //default method are not necessary to override in subclass,but you should delete the default when override in subclass.
    public default void eat(){
        System.out.println("小动物在吃东西");
    }
    //接口里面的静态方法只能通过接口名调用,用实现类名,或者实现类的对象名都无法调用
    public static void sleep(){
        System.out.println("animals are sleeping");
    }

}
