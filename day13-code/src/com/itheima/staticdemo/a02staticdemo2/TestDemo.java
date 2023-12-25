package com.itheima.staticdemo.a02staticdemo2;

/**
 * 测试类先写main方法
 */
public class TestDemo {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 50, 34, 100};
        String str = ArrayUtility.printArr(arr1);
        System.out.println(str);


        double[] arr2 = {1.1, 1.2, 1.3};
        double average = ArrayUtility.getAverage(arr2);
        System.out.println(average);


        double[][] doubles = new double[3][];
        doubles[0]=arr2;
        doubles[1]=arr2;
        doubles[2]=new double[]{1.1,1.1};
        double average1 = ArrayUtility.getAverage(doubles);
        System.out.println(average1);
    }

}
