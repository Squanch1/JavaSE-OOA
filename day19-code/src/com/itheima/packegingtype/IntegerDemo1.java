package com.itheima.packegingtype;

import java.util.Scanner;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //约定:以后不论键盘录入什么类型的数据都使用nextLine,然后使用其对应的包装类的的静态方法parseXxx转换即可
        String next = sc.nextLine();
//        //写一个只要数字的正则(整数)
//        String s = next.replaceAll("\\D+", "");
//        int i = Integer.parseInt(s);

        //写一个只要数字的正则(浮点数)



       // double v = Double.parseDouble(next);
    }
}
