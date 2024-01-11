package com.itheima.recursion;
/**
 * 爬楼梯问题就是一个类斐波那契数列
 * 递归式只需要考虑一步能到的范围.
 * */
public class Stairs {


    public static void main(String[] args) {
        System.out.println(getCounter(20));
    }
    public static int getCounter(int stairs){
        if(stairs==1){
            return 1;
        }
        if (stairs==2){
            return 2;
        }if (stairs==3){
            return 4;
        }
        if(stairs>2){
           return getCounter(stairs-1)+getCounter(stairs-2)+getCounter(stairs-3);
        }else {
            System.out.println("输入不合法!");
            return -1;
        }
    }
}
