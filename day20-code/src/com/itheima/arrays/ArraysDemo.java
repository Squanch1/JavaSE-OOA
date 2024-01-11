package com.itheima.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//alt+enter可以快速把匿名内部类(anonymous class)转化为lambda表达式
//而且该过程可逆


public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        //如果查找的数字不存在,那么返回(-插入值-1),虽然说是插入值,但是原数组并不会真的插入数据
        int i = Arrays.binarySearch(arr, 100);
        //  System.out.println(i);
        //  System.out.println(Arrays.toString(arr));
        Integer[] arr2 = {1, 8, 3, 4, 5, 6};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Arrays.sort(arr2,                                                                                                                                                                                                                                                                                                                       (o1, o2) -> {
            return o1 - o2;
        });

        //lambda表达式最简形式

        //sort方法的重载,必须要求待排序数组是一个引用数据类型数组,基本数据类型对应的包装类就是引用数据类型.
        Arrays.sort(arr2, (o1, o2) -> o2 - o1);


        System.out.println(Arrays.toString(arr2));
    }
}
