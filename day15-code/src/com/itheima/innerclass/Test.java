package com.itheima.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.inner oi = new Outer.inner();
        Outer2.inner inner = new Outer2().new inner();
        Outer.inner.eat();
        Outer.inner inner1 = new Outer.inner();
        inner1.sleep();
    }
}
