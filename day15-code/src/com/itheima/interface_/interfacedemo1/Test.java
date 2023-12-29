package com.itheima.interface_.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.setAge(10);
        frog.setName("青蛙王子");
        frog.eat();
        frog.swim();

        frog.defaultMethod();
        int test = Frog.TEST;
        int test1 = frog.TEST;



    }
}
