package com.itheima.a07regularexperssion;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的qq号");
            String next = sc.next();
            boolean flag = checkQQNumber(next);
            System.out.println(flag);
        }
    }


/**
 * 核心思想:过滤异常数据,最后得到的就是合法数据.这样写可能有点奇怪,但是这样子代码阅读性很高,可以避免复杂的嵌套结构.
 * 1.先判断长度
 * 2.在判断开头
 * 3.最后遍历字符串得到每一个元素,对内容校验.
 * */
    private static boolean checkQQNumber(String next) {
        int length = next.length();
        if (!(length >= 6 && length <= 20)) {
            //先用false筛选掉一些错误情况,可以避免复杂的嵌套
            return false;
        }
        if (next.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = next.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}


