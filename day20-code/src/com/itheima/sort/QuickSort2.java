package com.itheima.sort;

import java.util.Random;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random r = new Random(Integer.MAX_VALUE);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= r.nextInt();
        }
        long time1 = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        BubbleSort.printArr(arr);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotPos = partition(arr, left, right);
            quickSort(arr, left, pivotPos - 1);
            quickSort(arr, pivotPos + 1, right);
        }
    }
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left< right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }
}
