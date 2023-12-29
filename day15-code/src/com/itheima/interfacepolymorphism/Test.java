package com.itheima.interfacepolymorphism;

public class Test {
    Swim s = new Swim() {
        @Override
        public void swim() {
            System.out.println("我也在喝水");
        }
    };
    public static void main(String[] args) {
        Swim s = new Swim() {
            public final int AGE = 20;
            @Override
            public void swim() {
                System.out.println("狗在游泳");
            }
        };
        s.swim();
        System.out.println(s.AGE);


    }
}
