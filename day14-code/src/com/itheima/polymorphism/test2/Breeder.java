package com.itheima.polymorphism.test2;

public class Breeder extends Person {
    public Breeder() {
    }

    public Breeder(String name, int age) {
        super(name, age);
    }
    @Override
    public void keepPet(Animal a,String something){
        //以前的一个误区:if和instanceof 只是用来对父类类型强制转换的,大括号里不用写东西,实则不然.
        //要强制类型转换的情况就是想使用子类特有的方法,对于不同的类执行的方法也不同,所以在if大括号里面应该是有指向语句的.
        if(a instanceof Dog dog){
            /*
            * 执行语句
            * */
        }else if (a instanceof Cat cat){
        }else {
            System.out.println("类型不存在,无法转换");
            return;
        }
        System.out.printf("年龄为%d的%S养了一只%S颜色的pet",super.getAge(),super.getName(),a.getColor());
        System.out.println();
        //
        System.out.printf("%d岁的%s颜色的pet前腿紧紧抱住%s猛吃",a.getAge(),a.getColor(),something);
        System.out.println();
    }
}
