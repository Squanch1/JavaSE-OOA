package com.itheima.extendsdemo.a03extendsdemo3;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, String gender) {
        //因为构造方法不能继承,但是可以用super调用父类构造方法.而且必须写在第一行
        //如果构造方法需要调用其他构造方法,那么其他的构造方法必须写在第一行.super(),就是其中的一种表现形式.
        //而且子类的构造方法中如果没有任何构造方法,那么第一行默认是是父类的构造方法,默认是super();即父类空参构造.
        //如果有构造,分为子类的其他构造和父类构造.这两种情况JVM都不会添加super();后者好理解,前者是因为子类的其他构造中大概率是没有构造的,那么就会有一个super();
        //子类中直接或间接调用了父类构造,这是必然的.不然对于实际内存中,实例变量必须初始化后才能使用,所有变量不初始化都不能使用
        //如果子类用this调用了其他的本类构造,虚拟机可以不用再添加super(),因为本类其他构造里面一般是有super()的.
        //构造方法中调用其他构造方法,这个其他的构造方法和super()一样,只能在构造方法的代码中的第一行.
        super(name, gender);
    }

}
