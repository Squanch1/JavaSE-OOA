package com.itheima.extendstest.a01extendstest1;

public class Cook extends Employee {
    @Override
    public void work(){
        System.out.println(this.getName()+"正在炒菜");
    }

    public Cook() {
        //隐藏了super(),即对父类空参构造方法的调用.
    }

    public Cook(String workNumber, String name, double salary) {
        super(workNumber, name, salary);
    }

}
