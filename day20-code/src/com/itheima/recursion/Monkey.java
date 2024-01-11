package com.itheima.recursion;
/**
 * 反向递归
 * */
public class Monkey {
    public static void main(String[] args) {
        int number = getCount(1);
        System.out.println(number);
    }

    public static int getCount(int day) {
        if(day<=0||day>=11){
            System.out.println("参数错误!");
            return -1;
        }
        if (day == 10) {
            return 1;
        } else {
            return (getCount(day + 1) + 1) * 2;
        }
    }
}
