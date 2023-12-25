package com.itheima.extendstest.a02extendstest2;

public class Buyer extends AdminStuff{
    public Buyer() {
    }

    public Buyer(String code, String name) {
        super(code, name);
    }
    //重载的方法中是可以调用父类重载前的方法的.
    @Override
    public void work() {
        System.out.println(getName()+"在采购");
    }
}
