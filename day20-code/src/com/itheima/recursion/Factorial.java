package com.itheima.recursion;
// recursion(递归的核心思路)
// 1.找到递归式
// 2.找到递归的结束条件
public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(10);
        System.out.println(factorial);
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
