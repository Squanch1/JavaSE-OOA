package com.itheima.abstractclass_method.test1;
// 如果包名违反了标识符名称硬性规定
// 1.只能由字母,数字,_,$构成
// 2.域名反写加文件夹功能,见名知意,全英文小写.
// 则该文件夹下无法创建Java文件
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public void drink(){
        System.out.println("喝水");
    }
}
