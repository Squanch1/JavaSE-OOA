package com.itheima.sort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt();
        }
        long time1 = System.currentTimeMillis();
        bubbleSort(arr);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //j+1注意下标越界问题
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
