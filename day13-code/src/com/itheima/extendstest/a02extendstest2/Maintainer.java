package com.itheima.extendstest.a02extendstest2;

public class Maintainer extends AdminStuff{
    public Maintainer() {
    }

    public Maintainer(String code, String name) {
        super(code, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"在维护");
    }
}
