package com.itheima.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        BubbleSort.printArr(arr);
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        int base = arr[i];

        while (start != end) {
            //一定只能先移动end,后移动start
            while (true) {
                if (start >= end || arr[end] < base) {
                    break;
                }
                end--;
            }
            while (true) {
                if (start >= end || arr[start] > base) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }


        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;


    }
}
