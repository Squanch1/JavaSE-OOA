package com.itheima.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 既然lambda表达式可以作为函数式接口的实参,那么lambda表达式就可以用函数式接口的实现类对象去接收.
 * */
public class LambdaDemo {
    public static void main(String[] args) {
        String[] arr = {"abandon","apple","abort","app","ab"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
        Arrays.sort(arr,(o1,o2)->o1.length()-o2.length());
        System.out.println(Arrays.toString(arr));
    }
}
