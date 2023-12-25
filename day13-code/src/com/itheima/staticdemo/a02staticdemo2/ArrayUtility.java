package com.itheima.staticdemo.a02staticdemo2;

import java.util.StringJoiner;

/**
 * 目前已经学习了三种大类
 * 1.JavaBean类:是对一类事物描述的类.成员方法不用static修饰(正常情况下)
 * 2.测试类:是对其他类中代码进行测试的类,用来判断代码是否正确.里面会有main方法,是程序的入口.
 * 3.工具类:不是对一类事物的描述,里面没有任何的成员变量,只是提供一些功能的类.
 * 工具类只是static修饰符的一个使用场景
 * (1)见名知意,驼峰命名
 * (2)私有化构造方法
 * (3)方法定义为静态(所有的成员方法用static修饰)
 * */
//工具类先写私有化空参构造方法
public class ArrayUtility {
    private ArrayUtility() {
    }

    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
       return sj.toString();
    }
    public static double getAverage(double[] arr){
        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static double getAverage(double[][] arr){
        double sum =0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        return sum/count;
    }



}
