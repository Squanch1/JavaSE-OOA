package com.itheima.extendstest.a02extendstest2;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String code, String name) {
        super(code, name);
    }
    @Override
    public void work() {
        System.out.println(getName()+"在助教");
    }
}
