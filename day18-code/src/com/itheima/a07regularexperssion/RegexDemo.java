package com.itheima.a07regularexperssion;

public class RegexDemo {
    public static void main(String[] args) {
        //捕获分组
        String str = "aa111aa";
        String regex = "((.)\\2+).+\\1";
        System.out.println(str.matches(regex));
        String str1 = "我喜喜喜喜喜喜喜喜欢欢欢欢欢欢欢欢欢欢欢你你你你你你你你你你";

        //对于这种灵活的捕获分组,整个字符串只需要用一次就行
        System.out.println(str1.replaceAll("(.)\\1+", "$1"));

        String str2 = "喜羊羊dsjfkljdslfjadslds章鱼哥lkdsjgldksjfdslj炎龙侠";
        String[] split = str2.split("\\w+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


    }
}
