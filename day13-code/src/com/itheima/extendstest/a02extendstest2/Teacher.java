package com.itheima.extendstest.a02extendstest2;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String code, String name) {
        super(code, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"正在教研");
    }
}
