package com.itheima.extendstest.a01extendstest1;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
        //隐藏了super();
    }
    public Manager(String workNumber, String name, double salary, double bonus) {
        //对子类成员变量初始化前,一定会先调用父类的构造方法对从父类继承过来的成员变量初始化
        super(workNumber, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"正在管理别人");
    }
}
