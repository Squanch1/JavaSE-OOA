package com.itheima.a02systemdemo;

import java.io.IOException;

public class SystemDemo1 {
    public static void main(String[] args) throws IOException {

        //获得当前运行环境的logic processors(逻辑处理器)的数量,即线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//20

        //获得当前运行环境下JVM最大可以使用的内存大小,单位是byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);//4028

        //获得当前运行环境下JVM已经占用的内存大小,单位是byte
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);//252

        //获得当前运行环境下JVM占用了但还未使用的内存大小,单位是byte
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);//248

        //totalMemory - freeMemory就是已经JVM正在使用的内存大小.

        Runtime.getRuntime().exec("shutdown -a");


    }
}
