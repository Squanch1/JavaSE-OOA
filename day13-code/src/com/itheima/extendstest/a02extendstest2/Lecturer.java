package com.itheima.extendstest.a02extendstest2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String code, String name) {
        super(code, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"在主讲");
    }
}
