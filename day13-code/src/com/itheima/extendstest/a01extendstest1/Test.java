package com.itheima.extendstest.a01extendstest1;

public class Test {
    public static void main(String[] args) {
        Cook zhagnsan = new Cook("001", "zhagnsan", 3000);
        Manager lisi = new Manager("002", "lisi", 13000,500);
        zhagnsan.work();
        zhagnsan.eat();
        lisi.work();
        lisi.eat();
    }
}
