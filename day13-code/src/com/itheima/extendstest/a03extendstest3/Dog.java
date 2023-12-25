package com.itheima.extendstest.a03extendstest3;
/**
 * 先写成员变量
 * 然后写全参和空参构造
 * 然后写set和get方法,最后有其他方法补充
 * */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    public void lookHome(){
        System.out.println("看家");
    }


}
