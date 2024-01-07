package com.itheima.sort;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt();
        }
        long time1 = System.currentTimeMillis();
        selectionSort(arr);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }

    public static void selectionSort(int[] arr) {
        //外循环控制选择排序的轮数,拿着i索引的值和后面的比较
        for (int i = 0; i < arr.length - 1; i++) {
            //j索引代表的就是i索引后面的数据,所以应该从i+1开始
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }
}
