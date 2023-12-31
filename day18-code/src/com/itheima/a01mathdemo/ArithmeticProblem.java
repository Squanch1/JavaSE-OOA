package com.itheima.a01mathdemo;

public class ArithmeticProblem {
    public static void main(String[] args) {
        boolean flag = judgePrime(11);
        System.out.println(flag);
        narcissisticNumber();
        System.out.println(1.0000 == 11);

    }

    private static boolean judgePrime(int number) {
        //一定是小于等于sqrt,等于号不能省略.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void narcissisticNumber() {
        //打死不要动循环变量
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += (int) Math.pow(temp % 10, 2);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count);
    }
}
