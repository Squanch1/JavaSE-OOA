package com.itheima.search;

public class A01_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 23;
        int index = binarySearch(arr, number);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        int middle;
        // 两种循环的风格:
        // 1.如果知道循环的执行条件,那么就可以直接写.
        // 2.如果只知道循环的结束条件,而且循环的执行条件不好写.那么可以写一个死循环,然后里面写一个跳出循环的if语句就行.
        while (min <= max) {
            middle = min + (max - min) / 2;
            if (arr[middle] == number) {
                return middle;
            } else if (arr[middle] > number) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
        }
        return -1;
    }
}
