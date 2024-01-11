package com.itheima.sort;

import java.util.Arrays;

/**
 * 快速排序用到了递归的思想,稍微有点难
 * 对于partition方法不论是从小到大还是从大到小排序,因为pivot选取的都是left,所以arr[left]有了一份拷贝,而且代码比较特殊,是直接赋值,不是交换值.
 * 所以只能先移动right指针,后移动left指针.
 * 如果先移动left,必然会覆盖原值
 */
public class QuickSort3 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotPos = partition1(arr, left, right);
            quickSort(arr, left, pivotPos - 1);
            quickSort(arr, pivotPos + 1, right);
        }
    }

    public static int partition1(int[] arr, int left, int right) {
        int pivot = arr[left];
        //理想的情况是出外层循环时,left==right,这个right就是我们要找的pivotPos的值
        while (true) {
            if (right == left) {
                break;
            }
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = pivot;
        return right;
    }

    public static int partition2(int[] arr, int left, int right) {
        int pivot = arr[left];
        //理想的情况是出外层循环时,left==right,这个right就是我们要找的pivotPos的值
        while (true) {
            if (right == left) {
                break;
            }
            //内层的while循环体内,对right和left的修改可能会导致right和left错开,这种情况是不能接受的,left和right是连续变化的
            // 所以出循环的时候只能是left==right
            //还是只能先动right
            while (left < right && arr[right] <= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] >= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = pivot;
        return right;
    }
}
