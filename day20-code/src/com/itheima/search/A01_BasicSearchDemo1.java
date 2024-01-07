package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {

        int[] arr = {1, 23, 56, 3, 12, 12, 34, 57, 23, 578, 88, 64, 35, 26};
        int number = 12;
        ArrayList<Integer> list = basicSearch(arr, number);
        System.out.println(list);
    }

    private static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
