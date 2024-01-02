package com.itheima.a07regularexperssion;

public class Regex {
    //[]表示一个字符[xXaA](四选一)
    //(x|X|a|A)效果和上面的一样
    //(?i)表示忽略大小写
    public static void main(String[] args) {
        System.out.println(".".matches("\\w{4,16}"));
        System.out.println(".".matches("."));
        System.out.println(".".matches("\\d{17}(\\d|(?i)x)"));

        //?:表示非捕获组
        //?i表示不区分大小写

        String regex2 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])([0][1-9]|[12][0-9]|30|31)\\d{3}(\\d|(?i)x)";

    }
}