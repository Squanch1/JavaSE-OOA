package com.itheima.sort;

import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt();
        }
        long time1 = System.currentTimeMillis();
    insertSort(arr);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }

    public static void insertSort(int[] arr) {
        int beginIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                beginIndex = i + 1;
                break;
            }
        }
        for (int i = beginIndex; i < arr.length; i++) {
            //循环变量需要改变时,一定要创建一个临时拷贝,循环变量不能随意改动.
            int j = i;

            //看到j--就想到j>0,看到j++就要想到j<arr.length,要养成防止索引越界的意识.
            while (j > 0 && arr[j - 1] > arr[j]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                j--;
            }
        }
    }
}
