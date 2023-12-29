package com.itheima.innerclass;

public class Outer {
    static class inner {
        public static void eat() {
            System.out.println("我是静态方法");
        }
        public void sleep(){
            System.out.println("我是非静态方法");
        }

    }
}
