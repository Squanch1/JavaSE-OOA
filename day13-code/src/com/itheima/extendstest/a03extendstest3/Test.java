package com.itheima.extendstest.a03extendstest3;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(2,"白色");
        Dog dog = new Dog(2,"黑色");
        Person person = new Person("程梓康",20);
        person.keepDog(dog,"骨头");
        person.keepCat(cat,"小鱼干");
    }
}
