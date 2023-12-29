package com.itheima.staticdemo.a03staticdemo3;

import com.itheima.extendstest.a03extendstest3.Cat;

/**
 * 标准JavaBean类先写私有化成员变量
 * 静态变量属于类的层级,存储在静态区中,静态区属于方法区.
 * 再写空参和全参构造
 * 再写所有的私有化成员变量的set和get方法
 * 最后如果有其他行为,补上成员方法
 * ps:JavaBean类中的成员方法一般都不用static修饰
 * (构造方法属于特殊的成员方法),构造方法用于对象的实例化时赋值,属于对象层级,一定不能用static修饰
 */

public class Student extends Cat {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        System.out.println(this);
        this.name = name;
        //this.age的形式是不是很像对象名.成员变量的形式呢?
        //其实this就是对对象名的拷贝,专业来说就是方法调用者中存储的地址值.
        this.age = age;
        this.gender = gender;
    }

    //非静态的成员方法的形参中都有一个隐藏的this(可以理解为一个变量),类型就是本类的类型,this就是虚拟机专用的变量名.由虚拟机赋值
    //因为构造方法是很特殊的成员方法,在构造方法中手动书写要报错,但是里面肯定是有一个隐含的this的,不然方法里面凭什么能用this.
    public String getName() {
        System.out.println(this);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        //如果方法中没有局部变量,那么一定是成员变量,虚拟机自动加上this.来找到对象的成员变量,手动写上也没问题
        //有点类似于类定义的时候如果没有任何构造方法,虚拟机就加上一个空参构造
        return age;
    }

    public void setAge(int age) {
        //如果有局部变量,那虚拟机就不加this,需要开发者手动添加
        //类似于有了全参构造,虚拟机就不添加空参构造,需要开发者手动添加空参构造
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
