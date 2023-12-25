package com.itheima.extendstest.a02extendstest2;
/**
 * 创建完JavaBean类之后先确定继承关系
 * */

public class AdminStuff extends Employee {
    public AdminStuff() {
    }

    public AdminStuff(String code, String name) {
        super(code, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"管理行政");
    }
}
